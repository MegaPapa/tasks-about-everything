package com.megapapa.spring.beans.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    @Autowired
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}
