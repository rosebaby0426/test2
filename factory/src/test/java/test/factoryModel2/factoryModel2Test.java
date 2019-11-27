package test.factoryModel2;

import com.practice.test.factoryModel2.Car;
import com.practice.test.factoryModel2.ICarFactory;
import com.practice.test.factoryModel2.impl.BikeFactory;
import com.practice.test.factoryModel2.impl.BusFactory;
import com.practice.test.factoryModel2.impl.MRTFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class factoryModel2Test {

    /**
     * <<<工廠模式的優點：
     *
     * 1.一個調用者想創建一個對象，只要知道其名稱就可以了，降低了耦合度
     *
     * 2.擴展性提高，如果想增加一個產品，只要擴展一個工廠類就可以了，使得代碼結構更加清晰
     *
     * 3.屏蔽產品的具體實現，調用者只關心產品的接口
     *
     * <<<工廠模式的缺點：
     *
     * 1.一個對象擁有很多子類
     *
     * 2.創建某個對象時需要許多額外的操作
     *
     * 3.系統後騎需要經常擴展，他把對像實例化任務交由實現類完成，擴展性好
     *
     *
     * **/

    @Test
    public void test(){
        ICarFactory factory = null;

        //bike
        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.getWork();

        //bus
        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.getWork();

        //MRT
        factory = new MRTFactory();
        Car mrt = factory.getCar();
        mrt.getWork();
    }
}
