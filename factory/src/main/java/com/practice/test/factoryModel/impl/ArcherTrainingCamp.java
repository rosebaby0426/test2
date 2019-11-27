package com.practice.test.factoryModel.impl;

import com.practice.test.factoryModel.Adventurer;
import com.practice.test.factoryModel.TrainingCamp;

public class ArcherTrainingCamp implements TrainingCamp {

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        return new Archer();
    }
}
