package com.practice.test.abstractFactory1;

import com.practice.test.abstractFactory1.clothes.Clothes;
import com.practice.test.abstractFactory1.weapon.Weapon;

/**
 * 裝備工廠介面(Factory)-定義每一間工廠應該生產哪些東西
 */
public interface EquipFactory {
    /**
     * 製造武器
     */
    Weapon productWeapon();
    /**
     * 製造衣服
     */
    Clothes productArmor();
}
