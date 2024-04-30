package com.spring.circulardependency.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    @Autowired
    @Lazy
    private ServiceA serviceA;
}
