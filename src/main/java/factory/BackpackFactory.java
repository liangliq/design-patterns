package factory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class BackpackFactory implements IFactory {

    public Product CreateProduct() {
        return new Backpack();
    }
}
