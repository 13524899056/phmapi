package com.snowlink.phmapi.interceptors;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.snowlink.phmapi.annotation.LoginRequired;
import com.snowlink.phmapi.manager.OAuthTokenManager;
import com.snowlink.phmapi.model.User;

public class AuthenticationInterceptor implements HandlerInterceptor {
	@Autowired
	private OAuthTokenManager oauthManager;
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 如果不是映射到方法直接通过
		if (!(handler instanceof HandlerMethod)) {
			return true;
		}
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();

		// 判断接口是否需要登录
		LoginRequired methodAnnotation = method.getAnnotation(LoginRequired.class);
		// 有 @LoginRequired 注解，需要认证
		if (methodAnnotation != null) {
			// 执行认证
			String token = request.getHeader("token"); // 从 http 请求头中取出 token
			if (token == null) {
				throw new RuntimeException("无token，请重新登录");
			}
			int userId;
			try {
				User user = oauthManager.validateToken(token);
				request.setAttribute("user", user);
				// userId = Integer.parseInt(Jwt.decode(token).getAudience().get(0)); // 获取
				// token 中的 user id
			} catch (Exception e) {
				throw new RuntimeException("token无效，请重新登录");
			}
			return true;
		}
		return true;
	}
	
	  private Map<String ,Object> getRequestMap(ServletRequest request) {  
		  try {        
			  Object innerRequest = requestField.get(request);  
		  parametersParsedField.setBoolean(innerRequest, true);          
		  
		  Object coyoteRequestObject = coyoteRequestField.get(innerRequest);  
		  Object parameterObject = parametersField.get(coyoteRequestObject);   
		  return (Map<String,Object>)hashTabArrField.get(parameterObject);  
		  } catch (IllegalAccessException e) {          
			  e.printStackTrace();         
			  return Collections.emptyMap();  
			  }    
		  }
	  
	  private static Field requestField;  
	  private static Field parametersParsedField; 
	  private static Field coyoteRequestField;     
	  private static Field parametersField;       
	  private static Field hashTabArrField;    
	  private static String REQUEST_METOOD = "POST";  
	  private Field[] declaredFields = null;
}
