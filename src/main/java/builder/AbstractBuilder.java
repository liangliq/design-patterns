package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public abstract class AbstractBuilder {
    private String typeName;

    public AbstractBuilder TypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    protected Product product = new Product();

    public abstract void BuildProduct();


    public Product getProduct() {
        return product;
    }

}
