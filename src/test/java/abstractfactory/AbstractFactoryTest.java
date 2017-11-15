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
    public void Test(){

        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractFactory factoryB = new ConcreteFactoryB();
        factoryA.CreateProductA();
        factoryA.CreateProductB();
        factoryB.CreateProductA();
        factoryB.CreateProductB();

    }

}