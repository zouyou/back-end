package com.zoushiyou.web.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration  //必须存在
@EnableSwagger2 //必须存在
@EnableWebMvc   //必须存在
@ComponentScan(basePackages = {"com.zoushiyou.web.core"}) //必须存在
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("QQ:511570155", "https://github.com/zouyou", "511570155@qq.com");
        return new ApiInfoBuilder()
                .title("后台API接口")
                .description("")
                .contact(contact)
                .version("1.0.1")
                .build();
    }
}
