package simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class SimpleFactoryTest {
    @Test
    public void Test(){

        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.Animals("Cats").Saying();
        simpleFactory.Animals("Dogs").Saying();

    }

}