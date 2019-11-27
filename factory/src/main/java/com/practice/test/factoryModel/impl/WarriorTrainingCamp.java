package com.practice.test.factoryModel.impl;

import com.practice.test.factoryModel.Adventurer;
import com.practice.test.factoryModel.TrainingCamp;

public class WarriorTrainingCamp implements TrainingCamp {

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        return new Warrior();
    }
}
