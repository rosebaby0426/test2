package com.practice.test.factoryModel2.impl;

import com.practice.test.factoryModel2.Car;
import com.practice.test.factoryModel2.ICarFactory;

public class BusFactory implements ICarFactory {

    @Override
    public Car getCar() {
        return new Bus();
    }
}
