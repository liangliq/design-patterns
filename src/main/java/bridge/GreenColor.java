package bridge;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class GreenColor extends AbstractColor {

    @Override
    public void getColor() {
        System.out.println("Green");
        shape.paint();
    }
}
