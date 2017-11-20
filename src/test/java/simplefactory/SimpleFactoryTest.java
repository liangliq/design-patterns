package simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 * Create object as the string you putting in.
 * Simple factory is static because it's simple and easy to use
 */
public class SimpleFactoryTest {
    @Test
    public void Test(){

        SimpleFactory.setAnimals("Cats").saying();
        SimpleFactory.setAnimals("Dogs").saying();

    }

}