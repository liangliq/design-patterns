package bridge;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class RedColor extends AbstractColor {

    @Override
    public void getColor() {
        System.out.println("Red");
        shape.paint();
    }
}
