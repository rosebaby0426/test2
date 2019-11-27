package test.abstractFactory;

import com.practice.test.abstractFactory1.adventurer.Adventurer;
import com.practice.test.abstractFactory1.clothes.Clothes;
import com.practice.test.abstractFactory1.EquipFactory;
import com.practice.test.abstractFactory1.TrainingCamp;
import com.practice.test.abstractFactory1.weapon.Weapon;
import com.practice.test.abstractFactory1.equipFactoryImpl.ArcherEquipFactory;
import com.practice.test.abstractFactory1.equipFactoryImpl.WarriorEquipFactory;
import com.practice.test.abstractFactory1.trainingCampImpl.ArcherTrainingCamp;
import com.practice.test.abstractFactory1.trainingCampImpl.WarriorTrainingCamp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EquipFactoryTest {

    private EquipFactory equipFactory;

    @Test
    public void equipFactoryTest(){
        System.out.println("==========抽像工廠模式測試==========");
        // 幫弓箭手生產裝備
        equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productArmor();
        Weapon archerBow = equipFactory.productWeapon();

        // 皮甲的防禦應該是5，弓的攻擊為10，範圍為10
        Assert.assertEquals(5, archerLeather.getDef());
        Assert.assertEquals(10, archerBow.getAtk());
        Assert.assertEquals(10, archerBow.getRange());


        // 幫鬥士生產裝備
        equipFactory = new WarriorEquipFactory();
        Clothes armor = equipFactory.productArmor();
        Weapon longSword = equipFactory.productWeapon();

        // 盔甲的防禦應該是10，弓的攻擊為10，範圍為1
        Assert.assertEquals(10, armor.getDef());
        Assert.assertEquals(10, longSword.getAtk());
        Assert.assertEquals(1, longSword.getRange());


        // 弓箭手訓練營
        TrainingCamp camp = new ArcherTrainingCamp();
        // 訓練弓箭手
        Adventurer archer = camp.trainAdventurer();

        // 鬥士訓練營
        camp = new WarriorTrainingCamp();
        // 訓練鬥士
        Adventurer warrior = camp.trainAdventurer();

        archer.display();
        warrior.display();
    }
}
