package builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 * Client don't know the detail information of the product just new one builder to create what you want.
 * Also you can make all builder be configurable
 * Note: If the product is complicated please use AbstractFactory and if it's more complicated please use Builder
 */
public class AbstractBuilderTest {

    @Test
    public void test(){
        AbstractBuilder builder = new ConcreteBuilderA();
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();
    }

}