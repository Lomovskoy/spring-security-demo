package net.schastny.contactmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.*;

@Configuration
@EnableSwagger2
class SwaggerConfig {

    /**
     * Настройка сваггера
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.schastny.contactmanager.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                .useDefaultResponseMessages(false);
    }

    /**
     * Описание сервиса
     */
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "SPRINGBOOT-TEPLATE API",
                "Шаблон contact manager приложения",
                "1.0.0",
                "http://www.javacv.h1n.ru/",
                new Contact("Kirill", "http://www.javacv.h1n.ru/", "lomovskoy.kirill@yandex.ru"),
                "Kirill",
                "http://www.javacv.h1n.ru/", new ArrayList<>());
    }
}