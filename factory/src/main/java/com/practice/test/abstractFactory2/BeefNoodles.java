package com.practice.test.abstractFactory2;

/**
 * 牛肉麵
 * */
public class BeefNoodles extends Noodles{
    @Override
    public void make() {
        this.name = "牛肉麵";
        System.out.println( name + "製作");
    }
}
