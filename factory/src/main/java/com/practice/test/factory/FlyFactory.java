package com.practice.test.factory;
/**
 * 簡單工廠
 * 通過接收參數不同，返回不同的對象
 * */
public class FlyFactory {

    public Fly createFlyObject(String flyType){

        if("bird".equals(flyType)){
            return new Bird();
        } else if("plane".equals(flyType)){
            return new Plane();
        } else if("superman".equals(flyType)){
            return new SuperMan();
        } else {
            return null;
        }
    }
}
