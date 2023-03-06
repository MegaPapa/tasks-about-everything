package com.megapapa.spring.beans.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    // If it would be constructor-injection this code will fail, because circular deps can be managed only in
    // setter injection
    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
