package com.practice.test.abstractFactory2;
/**
 * 蘭州拉麵
 * */
public class LZNoodles extends Noodles {
    @Override
    public void make() {
        this.name = "蘭州拉麵";
        System.out.println( name + "製作");
    }
}
