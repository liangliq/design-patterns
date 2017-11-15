package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class ConcreteBuilderA extends AbstractBuilder {

    @Override
    public void BuildProduct() {
        product.Name("ProductA").Money(300);
        product.Print();
    }
}
