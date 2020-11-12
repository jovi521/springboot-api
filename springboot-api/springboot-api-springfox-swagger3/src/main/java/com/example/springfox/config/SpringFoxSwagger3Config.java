package com.example.springfox.config;

import com.example.springfox.component.ApplicationProperties;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author jovi
 */
@EnableOpenApi
@Configuration
public class SpringFoxSwagger3Config {

    private final ApplicationProperties applicationProperties;

    @Autowired
    public SpringFoxSwagger3Config(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(applicationProperties.getApplicationName())
                .description(applicationProperties.getApplicationDescription())
                .contact(new Contact(applicationProperties.getApplicationAuthor(), applicationProperties.getTryHost(), applicationProperties.getEmail()))
                .version(applicationProperties.getApplicationVersion())
                .build();
    }
}
