package com.practice.test.factory;

public class PlaneFactory implements FlyFactoryInterface {

    @Override
    public Fly getInstence() {
        return new Plane();
    }
}
