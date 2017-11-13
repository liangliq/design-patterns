package factory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public abstract class Product {
    private String name;
    private String factoryName;

    public Product Name(String name) {
        this.name = name;
        return this;
    }
    public Product FactoryName(String factoryName){
        this.factoryName = factoryName;
        return this;
    }

    public void ProductMessage(){
        System.out.println("Product name is " + name + " and factory is " + factoryName);
    }
}
