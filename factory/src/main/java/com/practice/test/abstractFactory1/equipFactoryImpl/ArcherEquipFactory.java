package com.practice.test.abstractFactory1.equipFactoryImpl;

import com.practice.test.abstractFactory1.clothes.Clothes;
import com.practice.test.abstractFactory1.EquipFactory;
import com.practice.test.abstractFactory1.weapon.Weapon;
import com.practice.test.abstractFactory1.clothes.Leather;
import com.practice.test.abstractFactory1.weapon.Bow;

/**
 * 專門生產弓箭手裝備的工廠(ConcreteFactory)
 */
public class ArcherEquipFactory implements EquipFactory {

    @Override
    public Weapon productWeapon() {
        Bow product = new Bow();
        product.setAtk(10);
        product.setRange(10);
        return product;
    }

    @Override
    public Clothes productArmor() {
        Leather product = new Leather();
        product.setDef(5);
        return product;
    }
}
