package com.practice.test.abstractFactory2;
/**
 * 麻辣麵
 * */
public class MLNoodles extends Noodles {

    @Override
    public void make() {
        this.name = "麻辣麵";
        System.out.println( name + "製作");
    }
}
