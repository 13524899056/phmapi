package com.snowlink.phmapi.manager;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.snowlink.phmapi.model.User;
import com.snowlink.phmapi.utils.RedisUtil;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class OAuthTokenManager {

	private String APP_ID = "app";
	private String APP_SECRET = "cc";
	private String KEY_SING = ""; // 用於存放TOKEN的標誌,Redis
	public static final int MINUTE_TTL = 60 * 1000; // millisecond
	public static final int HOURS_TTL = 60 * 60 * 1000; // millisecond
	public static final int DAY_TTL = 24 * 60 * 60 * 1000; // millisecond

	private OAuthTokenManager() {
	}

	private static OAuthTokenManager single = null;

	public static OAuthTokenManager getInstance() {
		if (single == null) {
			single = new OAuthTokenManager();
		}
		return single;
	}

	public String getKEY_SING() {
		return KEY_SING;
	}

// 
	public void accessPairs(String APP_ID, String APP_SECRET) {
		this.APP_ID = APP_ID;
		this.APP_SECRET = APP_SECRET;
	}

	/**
	 * 由字符串生成加密key
	 * 
	 * @return
	 */
	public SecretKey generalKey() {
		String stringKey = APP_ID + APP_SECRET;
		byte[] encodedKey = Base64.decode(stringKey);
		SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
		return key;
	}

	/**
	 * 由字符串生成加密key
	 * 
	 * @return
	 */
	public SecretKey generalKey(String secret) {
		if (StrUtil.isEmpty(secret)) {
			secret = "xsafa";
		}
		String stringKey = secret;
		byte[] encodedKey = Base64.decode(stringKey);
		SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
		return key;
	}

	/**
	 * 创建token
	 * 
	 * @param subject
	 * @param ttlMillis
	 * @return
	 * @throws Exception
	 */
	public String createToken(String subject, long ttlMillis) {

		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		SecretKey key = generalKey();
		JwtBuilder builder = Jwts.builder().setId(APP_ID).setIssuedAt(now).setSubject(subject)
				.signWith(signatureAlgorithm, key);
		if (ttlMillis >= 0) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date(expMillis);
			builder.setExpiration(exp);
		}
		return builder.compact();
	}

	@Autowired
	private RedisUtil redisUtil;

	public String token(User user) throws Exception {
		//remove token in redis
		redisUtil.del(user.getToken());
		String token = createToken(JSONUtil.parse(user).toString(), DAY_TTL);
		String key = getMd5(token);
		Map m = new HashMap();
		user.setToken(key);
		m.put("user", user);
		m.put("jwtToken", token);
		redisUtil.set(key, m,DAY_TTL);
		return key;
	}

	/**
	 * 解密token
	 * 
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public User validateToken(String token) throws Exception {
		Map o = (Map)redisUtil.get(token);
		if(o == null) {
			return null;
		}
		String jwt = (String)o.get("token");
		Claims claims = Jwts.parser().setSigningKey(generalKey()).parseClaimsJws(jwt).getBody();
		System.out.println("ID: " + claims.getId());
		System.out.println("Subject: " + claims.getSubject());
		System.out.println("Issuer: " + claims.getIssuer());
		System.out.println("Expiration: " + claims.getExpiration());
		return JSONUtil.toBean(claims.getSubject(), User.class);
	}

	public static String getMd5(String str) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
		return new BigInteger(1, md.digest()).toString(16);
	}

	public static void main(String[] args) throws Exception {
		OAuthTokenManager oauth = new OAuthTokenManager();
		Map user = new HashMap();
		user.put("id", "123");
		user.put("name", "jack");
		user.put("ageo", null);

		String subject = JSONUtil.parse(user).toString();

		String token = "";
		token = oauth.createToken(subject, 100000);

		// token
		// ="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhcHAiLCJpYXQiOjE1NDc1MTk0NTMsInN1YiI6IntcIm5hbWVcIjpcImphY2tcIixcImlkXCI6XCIxMjNcIn0iLCJleHAiOjE1NDc1MTk1NTN9.5TRYEjnmYWVP60KdFPJIgFn_35ab8Kkq1IDQpSlsTQc";
		System.out.println(token);
		String encode = Base64.encode(token);
		System.out.println(encode);
		System.out.println(getMd5(encode));
		System.out.println(Base64.decodeStr(encode));

		User c = oauth.validateToken(token);

	}

}
