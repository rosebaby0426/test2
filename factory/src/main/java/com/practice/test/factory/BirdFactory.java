package com.practice.test.factory;

public class BirdFactory implements FlyFactoryInterface{
    @Override
    public Fly getInstence() {
        return new Bird();
    }
}
