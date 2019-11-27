package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;
/**
 * 上海牛肉麵
 * */
public class SHBeefNoodles extends Noodles {

    @Override
    public void make() {
        this.setName("上海牛肉麵");
        System.out.println(this.getName() + "製作");
    }
}
