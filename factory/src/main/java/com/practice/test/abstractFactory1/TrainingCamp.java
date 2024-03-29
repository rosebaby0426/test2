package com.practice.test.abstractFactory1;

import com.practice.test.abstractFactory1.adventurer.Adventurer;

/**
 * 工廠介面-冒險者訓練營(這只是一個概念或規範，要訓練什麼，怎麼訓練留給子類別實作)
 */
public interface TrainingCamp {
    /**
     * 訓練冒險者的過程，訓練後請給我一個冒險者
     */
    public Adventurer trainAdventurer();

}
