package test.abstractFactory2;

import com.practice.test.abstractFactory3.OrderNoodles2;
import com.practice.test.abstractFactory3.SimpleNoodlesFactory;

public class AbstractFactoryTest2 {

    public static void main(String[] args){
        SimpleNoodlesFactory simpleNoodlesFactory = new SimpleNoodlesFactory();
        OrderNoodles2 orderNoodles2;
        orderNoodles2 = new OrderNoodles2(simpleNoodlesFactory);
    }
}
