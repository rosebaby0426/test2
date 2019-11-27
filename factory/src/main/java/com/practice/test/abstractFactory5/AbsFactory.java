package com.practice.test.abstractFactory5;

import com.practice.test.abstractFactory2.Noodles;

/**
 * 抽象工廠
 * */
public interface AbsFactory {
    public Noodles createNoodles(String orderType);
}
