package com.practice.test.factory;

public class Plane implements Fly {

    @Override
    public void fly() {
        System.out.println("飛機也會飛....");
    }
}
