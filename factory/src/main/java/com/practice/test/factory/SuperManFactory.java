package com.practice.test.factory;

public class SuperManFactory implements FlyFactoryInterface {

    @Override
    public Fly getInstence() {
        return new SuperMan();
    }
}
