package test.factory1;


import com.practice.test.factoryModel.Adventurer;
import com.practice.test.factoryModel.TrainingCamp;
import com.practice.test.factoryModel.impl.ArcherTrainingCamp;
import com.practice.test.factoryModel.impl.WarriorTrainingCamp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class factoryTest {

    @Test
    public void test() {
        System.out.println("==========工廠模式測試==========");

        //訓練營訓練冒險者
        //先用弓箭手訓練營訓練弓箭手
        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = trainingCamp.trainAdventurer();

        //用鬥士訓練營訓練鬥士
        trainingCamp = new WarriorTrainingCamp();
        Adventurer memberB = trainingCamp.trainAdventurer();

        //看看是不是真的訓練出我們想要的冒險者
        Assert.assertEquals(memberA.getType(), "Archer");
        Assert.assertEquals(memberB.getType(), "Warrior");

        // memberB應該是Warrior不是Knight，因此下面這行會報錯
        Assert.assertEquals(memberB.getType(), "Knight");
    }
}
