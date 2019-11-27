package com.practice.test.abstractFactory3;

import com.practice.test.abstractFactory2.Noodles;

import java.util.Scanner;

/**
 * 麵條訂單
 * */
public class OrderNoodles2 {

    SimpleNoodlesFactory simpleNoodlesFactory;

    public OrderNoodles2(SimpleNoodlesFactory simpleNoodlesFactory){

        setFactory(simpleNoodlesFactory);
    }

    public void setFactory(SimpleNoodlesFactory simpleNoodlesFactory){

        Noodles noodles = null;
        String orderType;

        this.simpleNoodlesFactory = simpleNoodlesFactory;

        do{
            orderType = getType();
            noodles = simpleNoodlesFactory.createNoodles(orderType);
            if(noodles != null){
                noodles.make();
                noodles.box();
            }
        } while(true);
    }

    private String getType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("請選擇你要的麵，ml:麻辣麵，beef:牛肉麵，lz:蘭州麵");
        String str = scan.next();
        return str;
    }
}
