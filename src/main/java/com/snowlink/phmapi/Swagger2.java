package com.snowlink.phmapi;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;

import io.swagger.models.parameters.Parameter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * Swagger2配置类
 * 
 * 在与spring boot集成时，放在与Application.java同级的目录下。
 * 
 * 通过@Configuration注解，让Spring来加载该类配置。
 * 
 * 再通过@EnableSwagger2注解来启用Swagger2。
 * 
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	/**
	 * 创建API应用
	 * apiInfo() 增加API相关信息
	 * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
	 * 本例采用指定扫描的包路径来定义指定要建立API的目录。
	 * @return
	 */

	@Bean

	public Docket createRestApi() {

		ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("token").description("令牌").modelRef(new ModelRef("String")).parameterType("header").required(true).build();
        List<springfox.documentation.service.Parameter> aParameters = Lists.newArrayList();
        aParameters.add(aParameterBuilder.build());
		return new Docket(DocumentationType.SWAGGER_2)
				.globalOperationParameters(aParameters)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.snowlink.phmapi.controller"))
				.paths(PathSelectors.any())
				.build();

	}

	/**
	 * 创建该API的基本信息（这些基本信息会展现在文档页面中）
	 * 访问地址：http://项目实际地址/swagger-ui.html
	 * @return
	 */

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder()
				.title("PHM RESTful APIs")
				.description("雪链智慧冷库接口")
				//.termsOfServiceUrl("http://www.baidu.com")
				//.contact("sunf")
				//.version("1.0")
				.build();
	}
}
