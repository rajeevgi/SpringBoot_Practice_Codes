package com.example.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    // Constructor Injection
    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is running...");
    }
}
