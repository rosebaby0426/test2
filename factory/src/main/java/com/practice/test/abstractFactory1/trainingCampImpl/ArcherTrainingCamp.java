package com.practice.test.abstractFactory1.trainingCampImpl;

import com.practice.test.abstractFactory1.adventurer.Adventurer;
import com.practice.test.abstractFactory1.adventurer.Archer;
import com.practice.test.abstractFactory1.EquipFactory;
import com.practice.test.abstractFactory1.TrainingCamp;
import com.practice.test.abstractFactory1.equipFactoryImpl.ArcherEquipFactory;

public class ArcherTrainingCamp implements TrainingCamp {

    private static EquipFactory factory = new ArcherEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        Archer archer = new Archer();
        // ...進行基本訓練
        // ...弓箭手訓練課程
        // 訓練完成配發裝備
        archer.setWeapon(factory.productWeapon());
        archer.setClothes(factory.productArmor());
        return archer;
    }
}
