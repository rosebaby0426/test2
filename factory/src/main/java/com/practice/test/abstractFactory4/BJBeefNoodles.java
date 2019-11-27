package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;
/**
 * 北京牛肉麵
 * */
public class BJBeefNoodles extends Noodles {

    @Override
    public void make() {
        this.setName("北京牛肉麵");
        System.out.println(this.getName() + "製作");
    }
}
