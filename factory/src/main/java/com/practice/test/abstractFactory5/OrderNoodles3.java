package com.practice.test.abstractFactory5;

import com.practice.test.abstractFactory2.Noodles;

import java.util.Scanner;

/**
 * 抽象工廠-訂單類
 */
public class OrderNoodles3 {

    AbsFactory absFactory;

    public OrderNoodles3(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        Noodles noodles = null;
        String orderType;
        this.absFactory = absFactory;
        do {
            orderType = getType();
            noodles = absFactory.createNoodles(orderType);
            if(noodles != null){
                noodles.make();
                noodles.box();
            }
        } while (true);
    }

    private String getType(){
        Scanner scan = new Scanner(System.in);
        System.out.println("請選擇你要的麵，ml:麻辣麵，beef:牛肉麵");
        String str = scan.next();
        return str;
    }
}
