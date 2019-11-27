package com.practice.test.abstractFactory1.trainingCampImpl;

import com.practice.test.abstractFactory1.adventurer.Adventurer;
import com.practice.test.abstractFactory1.EquipFactory;
import com.practice.test.abstractFactory1.TrainingCamp;
import com.practice.test.abstractFactory1.adventurer.Warrior;
import com.practice.test.abstractFactory1.equipFactoryImpl.WarriorEquipFactory;

/**
 * 實體工廠-鬥士訓練營
 */
public class WarriorTrainingCamp implements TrainingCamp {

    private static EquipFactory factory = new WarriorEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        Warrior warrior = new Warrior();
        // ...進行基本訓練
        // ...鬥士訓練課程

        // 訓練完成配發裝備
        warrior.setWeapon(factory.productWeapon());
        warrior.setClothes(factory.productArmor());
        return warrior;
    }
}
