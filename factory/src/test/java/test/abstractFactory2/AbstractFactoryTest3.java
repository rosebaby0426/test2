package test.abstractFactory2;

import com.practice.test.abstractFactory4.OrderNoodles;
import com.practice.test.abstractFactory4.SHOrderNoodles;

public class AbstractFactoryTest3 {

    public static void main(String[] args){
        OrderNoodles orderNoodles;
        orderNoodles = new SHOrderNoodles();
    }
}
