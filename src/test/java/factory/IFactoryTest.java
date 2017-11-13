package factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class IFactoryTest {
    @Test
    public void Test(){

        IFactory factory = new PenFactory();
        Product pen = factory.CreateProduct();
        pen.ProductMessage();
        factory = new BackpackFactory();
        Product backpack = factory.CreateProduct();
        backpack.ProductMessage();
    }

}