package com.practice.test.factory;
/**
 * 靜態工廠
 * 通過調用不同的方法，返回不同的對象
 * */
public class FlyFactory2 {

    public Fly getSuperMan(){
        return new SuperMan();
    }

    public Fly getPlane(){
        return new Plane();
    }

    public Fly getBird(){
        return new Bird();
    }
}
