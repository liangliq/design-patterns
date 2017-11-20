package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class ConcreteBuilderB extends AbstractBuilder {

    @Override
    public void BuildProduct() {
        product.setName("ProductB").setMoney(10000);
        product.print();
    }
}
