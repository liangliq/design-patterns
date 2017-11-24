package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class AbstractDecoratorTest {

    @Test
    public void test(){
        IComponent component = new ConcreteComponent();
        AbstractDecorator decorator = new ConcreteDecorator(component);
        decorator.display();
    }
}