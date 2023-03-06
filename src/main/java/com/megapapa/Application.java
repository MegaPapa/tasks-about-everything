package com.megapapa;

import com.megapapa.spring.beans.circular.BeanA;
import com.megapapa.spring.beans.circular.BeanB;
import com.megapapa.spring.beans.creation.ConfigurationCreatedBean;
import com.megapapa.spring.beans.creation.DefaultConfigurationCreatedBean;
import com.megapapa.spring.beans.creation.SimpleSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {

        var context = SpringApplication.run(Application.class);

//        Thread.sleep(3000);
        System.out.println(context.getBean(BeanA.class));
        System.out.println(context.getBean(BeanA.class).getBeanB());

        System.out.println(context.getBean(BeanB.class));
        System.out.println(context.getBean(BeanB.class).getBeanA());
    }
}
