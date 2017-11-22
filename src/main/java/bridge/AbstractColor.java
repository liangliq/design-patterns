package bridge;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public abstract class AbstractColor {
    IShape shape;

    public void setShape(IShape shape) {
        this.shape = shape;
    }
    public abstract void getColor();
}
