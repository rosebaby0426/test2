package com.practice.test.abstractFactory1.adventurer;

/**
 * 鬥士
 */
public class Warrior extends Adventurer {

    @Override
    public void display() {
        System.out.println("我是鬥士，裝備:");
        weapon.display();
        System.out.println();
        clothes.display();
        System.out.println();
    }

}
