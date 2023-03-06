package com.megapapa.spring.beans.creation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleSpringConfiguration {

    @Bean
    public ConfigurationCreatedBean configurationCreatedBean() {

        return new DefaultConfigurationCreatedBean();
    }
}
