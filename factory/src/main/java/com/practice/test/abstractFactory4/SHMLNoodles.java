package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;

/**
 * 上海麻辣麵
 */
public class SHMLNoodles extends Noodles {

    @Override
    public void make() {
        this.setName("上海麻辣麵");
        System.out.println(this.getName() + "製作");
    }
}
