package test.factory;

import com.practice.test.factory.Fly;
import com.practice.test.factory.FlyFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class factoryTest {

    FlyFactory flyFactory = new FlyFactory();

    @Test
    public void test(){
        Fly bird = flyFactory.createFlyObject("bird");
        bird.fly();

        Fly plane = flyFactory.createFlyObject("plane");
        plane.fly();

        Fly superman = flyFactory.createFlyObject("superman");
        superman.fly();
    }
}
