package factory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class PenFactory implements IFactory {

    public Product createProduct() {
        return new Pen();
    }
}
