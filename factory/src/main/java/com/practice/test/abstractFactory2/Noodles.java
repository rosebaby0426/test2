package com.practice.test.abstractFactory2;
/**
 * 麵條父類
 */
public abstract class Noodles {

    //麵條名稱
    String name;

    //每種麵條製作方式不同，聲明為抽象方法
    public abstract void make();

    //模擬定義為每種麵條打包方式一致
    public void box(){
        System.out.println( name + "打包");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
