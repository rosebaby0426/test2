package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;

/**
 * 北京麻辣麵
 */
public class BJMLNoodles extends Noodles {

    @Override
    public void make() {
        this.setName("北京麻辣麵");
        System.out.println(this.getName() + "製作");
    }
}
