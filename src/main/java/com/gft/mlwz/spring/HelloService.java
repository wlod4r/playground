package com.gft.mlwz.spring;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello world from HelloWorldComponent!";
    }
}
