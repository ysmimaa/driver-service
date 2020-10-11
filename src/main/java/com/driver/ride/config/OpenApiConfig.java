package com.driver.ride.config;

import com.driver.ride.config.properties.DriverProperties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Autowired
    private DriverProperties driverProperties;

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(driverProperties.getTitle())
                        .description(driverProperties.getDescription())
                        .version(driverProperties.getVersion()));
    }
}
