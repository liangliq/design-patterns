package abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 * Many product and many factory.
 * One factory can produce many product
 */
public class AbstractFactoryTest {

    @Test
    public void test(){

        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractFactory factoryB = new ConcreteFactoryB();
        factoryA.createProductA();
        factoryA.createProductB();
        factoryB.createProductA();
        factoryB.createProductB();

    }

}