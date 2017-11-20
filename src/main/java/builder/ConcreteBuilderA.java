package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class ConcreteBuilderA extends AbstractBuilder {

    @Override
    public void BuildProduct() {
        product.setName("ProductA").setMoney(300);
        product.print();
    }
}
