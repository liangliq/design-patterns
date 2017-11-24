package bridge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class BridgeTest {

    @Test
    public void test(){

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        AbstractColor redColor = new RedColor();
        redColor.setShape(rectangle);
        redColor.getColor();
        redColor.setShape(circle);
        redColor.getColor();

    }
}