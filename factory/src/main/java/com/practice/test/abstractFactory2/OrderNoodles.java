package com.practice.test.abstractFactory2;


import java.util.Scanner;


/**
 * 麵條訂單
 */
public class OrderNoodles {

    public OrderNoodles() {

        Noodles noodles = null;

        String orderType;

        do {
            orderType = getType();
            System.out.println(orderType);
            System.out.println(orderType.equals("ml"));

            if (orderType.equals("ml")) {
                //選了麻辣麵
                noodles = new MLNoodles();
                System.out.println(noodles);
                System.out.println(noodles.getName());
            } else if (orderType.equals("beef")) {
                //選了牛肉麵
                noodles = new BeefNoodles();
                System.out.println(noodles.getName());
            } else if (orderType.equals("lz")) {
                //選了蘭州麵
                noodles = new LZNoodles();
                System.out.println(noodles.getName());
            } else {
                break;
            }
            noodles.box();
        } while (true);
    }

    private String getType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("請選擇你要的麵，ml:麻辣麵，beef:牛肉麵，lz:蘭州麵");
        String str = scan.next();
        return str;
    }
}
