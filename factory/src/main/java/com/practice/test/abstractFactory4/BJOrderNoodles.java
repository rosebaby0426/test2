package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;
/**
 * 北京訂單類
 * */
public class BJOrderNoodles extends OrderNoodles {

    @Override
    Noodles createNoodles(String orderType) {

        Noodles noodles = null;
        if(orderType.equals("ml")){
            noodles = new BJMLNoodles();
        } else if(orderType.equals("beef")){
            noodles = new BJBeefNoodles();
        }
        return noodles;
    }
}
