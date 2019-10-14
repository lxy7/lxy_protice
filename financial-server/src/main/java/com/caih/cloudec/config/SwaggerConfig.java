package com.caih.cloudec.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 升级spring boot 后swagger设置需要调整 PathSelectors.ant("/user/web/**")不行
 * 
 * @author weisd
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

   /* @Value("${api.service.active.swagger}")
    private boolean activeSwagger;

    *//**
     * swagger的配置
     *
     * @return
     *//*
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().
        // apis(RequestHandlerSelectors.basePackage("xxx.xxx.xxx")).paths(PathSelectors.ant("/user/service/**")).build().enable(true);
            apis(RequestHandlerSelectors.basePackage("com.caih.cloudec")).paths(PathSelectors.any()).build()
            .enable(activeSwagger);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("report-server").description("report-server文档").version("1.0").build();
    }
*/
}