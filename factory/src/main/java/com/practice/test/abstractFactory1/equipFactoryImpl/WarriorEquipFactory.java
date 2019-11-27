package com.practice.test.abstractFactory1.equipFactoryImpl;

import com.practice.test.abstractFactory1.clothes.Clothes;
import com.practice.test.abstractFactory1.EquipFactory;
import com.practice.test.abstractFactory1.weapon.Weapon;
import com.practice.test.abstractFactory1.clothes.Armor;
import com.practice.test.abstractFactory1.weapon.LongSword;

/**
 * 專門生產鬥士裝備的工廠(ConcreteFactory)
 */
public class WarriorEquipFactory implements EquipFactory {

    @Override
    public Weapon productWeapon() {
        LongSword product = new LongSword();
        product.setAtk(10);
        product.setRange(1);
        return product;
    }

    @Override
    public Clothes productArmor() {
        Armor product = new Armor();
        product.setDef(10);
        return product;
    }
}
