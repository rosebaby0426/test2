package test.factory;

import com.practice.test.factory.Fly;
import com.practice.test.factory.FlyFactory2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class factoryTest2 {

    FlyFactory2 flyFactory2 = new FlyFactory2();

    @Test
    public void test(){
        Fly superMan = flyFactory2.getSuperMan();
        superMan.fly();

        Fly plane = flyFactory2.getPlane();
        plane.fly();

        Fly bird = flyFactory2.getBird();
        bird.fly();

    }
}
