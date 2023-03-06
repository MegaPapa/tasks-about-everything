package com.megapapa;

import com.megapapa.spring.beans.creation.ConfigurationCreatedBean;
import com.megapapa.spring.beans.creation.DefaultConfigurationCreatedBean;
import com.megapapa.spring.beans.creation.SimpleSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {

        var context = SpringApplication.run(Application.class);
        Thread.sleep(3000);
        System.out.println(context.getBean(DefaultConfigurationCreatedBean.class));
    }
}
