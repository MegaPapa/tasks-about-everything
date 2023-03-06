package com.megapapa.spring.beans.creation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DefaultConfigurationCreatedBean implements ConfigurationCreatedBean {

    @Override
    public void sayHello() {

    }
}
