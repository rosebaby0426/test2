package com.practice.test.factoryModel2.impl;

import com.practice.test.factoryModel2.Car;

public class Bus implements Car {

    @Override
    public void getWork() {
        System.out.println("坐公車上班");
    }
}
