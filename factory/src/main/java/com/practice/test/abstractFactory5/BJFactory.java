package com.practice.test.abstractFactory5;

import com.practice.test.abstractFactory2.Noodles;
import com.practice.test.abstractFactory4.BJBeefNoodles;
import com.practice.test.abstractFactory4.BJMLNoodles;

/**
 * 北京工廠
 * */
public class BJFactory implements AbsFactory{

    @Override
    public Noodles createNoodles(String orderType) {

        Noodles noodles = null;
        if(orderType.equals("ml")){
            noodles = new BJMLNoodles();
        }else if(orderType.equals("beef")){
            noodles = new BJBeefNoodles();
        }
        return noodles;
    }
}
