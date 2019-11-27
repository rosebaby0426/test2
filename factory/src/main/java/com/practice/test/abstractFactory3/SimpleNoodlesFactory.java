package com.practice.test.abstractFactory3;

import com.practice.test.abstractFactory2.BeefNoodles;
import com.practice.test.abstractFactory2.LZNoodles;
import com.practice.test.abstractFactory2.MLNoodles;
import com.practice.test.abstractFactory2.Noodles;

/**
 * 簡單工廠
 * */
public class SimpleNoodlesFactory {

    //實例化麵條對象
    public Noodles createNoodles(String orderType){

        Noodles noodles = null;

        if(orderType.equals("ml")){
            noodles = new MLNoodles();
        } else if(orderType.equals("beef")){
            noodles = new BeefNoodles();
        } else if(orderType.equals("lz")){
            noodles = new LZNoodles();
        }
        return noodles;
    }
}
