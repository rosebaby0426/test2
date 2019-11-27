package com.practice.test.abstractFactory5;

import com.practice.test.abstractFactory2.Noodles;
import com.practice.test.abstractFactory4.SHBeefNoodles;
import com.practice.test.abstractFactory4.SHMLNoodles;

/**
 * 上海工廠
 * */
public class SHFactory implements AbsFactory{

    @Override
    public Noodles createNoodles(String orderType) {

        Noodles noodles = null;
        if(orderType.equals("ml")){
            noodles = new SHMLNoodles();
        } else if(orderType.equals("beef")){
            noodles = new SHBeefNoodles();
        }
        return noodles;
    }
}
