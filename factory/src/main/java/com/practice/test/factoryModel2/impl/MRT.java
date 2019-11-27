package com.practice.test.factoryModel2.impl;

import com.practice.test.factoryModel2.Car;

public class MRT implements Car {

    @Override
    public void getWork() {
        System.out.println("坐捷運上班");
    }
}
