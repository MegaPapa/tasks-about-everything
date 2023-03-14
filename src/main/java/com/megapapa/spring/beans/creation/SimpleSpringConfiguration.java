package com.megapapa.spring.beans.creation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class SimpleSpringConfiguration {

    public SimpleSpringConfiguration() {

        System.out.println("1");
    }

    @Bean
    public static BPPTest configurationCreatedBean() {

        System.out.println("2");
        return new BPPTest();
    }
}
