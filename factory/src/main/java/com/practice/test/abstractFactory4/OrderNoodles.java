package com.practice.test.abstractFactory4;

import com.practice.test.abstractFactory2.Noodles;

import java.util.Scanner;

/**
 * 工廠模式-抽象類訂單
 * */
public abstract class OrderNoodles {
    public OrderNoodles(){
        Noodles noodles = null;
        String orderType;
        do{
            orderType = getType();
            noodles = createNoodles(orderType);
            noodles.make();
            noodles.box();
        }while (true);
    }

    abstract Noodles createNoodles(String orderType);

    private String getType(){
        Scanner scan = new Scanner(System.in);
        System.out.println("請選擇你要的麵，ml:麻辣麵，beef:牛肉麵");
        String str = scan.next();
        return str;
    }
}
