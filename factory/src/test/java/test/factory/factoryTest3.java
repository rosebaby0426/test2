package test.factory;

import com.practice.test.factory.BirdFactory;
import com.practice.test.factory.Fly;
import com.practice.test.factory.PlaneFactory;
import com.practice.test.factory.SuperManFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class factoryTest3 {

    @Test
    public void test() {
        BirdFactory birdFactory = new BirdFactory();
        Fly bird = birdFactory.getInstence();
        bird.fly();

        PlaneFactory planeFactory = new PlaneFactory();
        Fly plane = planeFactory.getInstence();
        plane.fly();

        SuperManFactory superManFactory = new SuperManFactory();
        Fly superMan = superManFactory.getInstence();
        superMan.fly();

    }
}
