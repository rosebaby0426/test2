package com.practice.test.factoryModel2.impl;

import com.practice.test.factoryModel2.Car;

public class Bike implements Car {
    @Override
    public void getWork() {
        System.out.println("騎腳踏車上班");
    }
}
