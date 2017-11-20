package factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 * One factory only produce one product
 */
public class IFactoryTest {
    @Test
    public void test(){

        IFactory factory = new PenFactory();
        Product pen = factory.createProduct();
        pen.productMessage();
        factory = new BackpackFactory();
        Product backpack = factory.createProduct();
        backpack.productMessage();
    }

}