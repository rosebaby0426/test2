package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;

/**
 * 上海訂單類
 */
public class SHOrderNoodles extends OrderNoodles {

    @Override
    Noodles createNoodles(String orderType) {

        Noodles noodles = null;
        if (orderType.equals("ml")) {
            noodles = new SHMLNoodles();
        } else if (orderType.equals("beef")) {
            noodles = new SHBeefNoodles();
        }
        return noodles;
    }
}
