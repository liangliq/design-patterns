package abstractfactory;

import factory.Product;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public abstract class AbstractFactory {

    private String factoryName;

    public AbstractFactory FactoryName(String factoryName) {
        this.factoryName = factoryName;
        return this;
    }

    public void PrintMessage(){
        System.out.print("Factory name is " + factoryName+" ");
    }
    public abstract AbstractProductA CreateProductA();

    public abstract AbstractProductB CreateProductB();
}
