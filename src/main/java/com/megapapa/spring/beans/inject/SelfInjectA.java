package com.megapapa.spring.beans.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Lazy
@Component
public class SelfInjectA implements SelfInjectable {

    @Resource
    private SelfInjectable selfInjectA;

    @PostConstruct
    public void init() {

        System.out.println(selfInjectA + " ------");
    }
}
