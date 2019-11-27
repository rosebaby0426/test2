package test.abstractFactory2;

import com.practice.test.abstractFactory2.OrderNoodles;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AbstractFactoryTest {


    public static void main(String[] args){
        AbstractFactoryTest test = new AbstractFactoryTest();
        test.test();
    }

//    @Test
    public void test(){

        OrderNoodles orderNoodles;
        orderNoodles = new OrderNoodles();

    }
}
