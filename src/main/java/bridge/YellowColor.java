package bridge;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class YellowColor extends AbstractColor {
    @Override
    public void getColor() {
        System.out.println("Yellow");
        shape.paint();
    }
}
