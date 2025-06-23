package com.example.Dependency_Injection;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){
        System.out.println("I am building a project.");
    }
}
