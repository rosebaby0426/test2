package test.abstractFactory2;

import com.practice.test.abstractFactory5.BJFactory;
import com.practice.test.abstractFactory5.OrderNoodles3;

public class AbstractFactoryTest4 {

    public static void main(String[] args){
        OrderNoodles3 orderNoodles3;
        orderNoodles3 = new OrderNoodles3(new BJFactory());
    }
}
