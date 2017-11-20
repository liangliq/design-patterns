package abstractfactory;

import factory.Product;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public abstract class AbstractFactory {

    private String factoryName;

    public AbstractFactory setFactoryName(String factoryName) {
        this.factoryName = factoryName;
        return this;
    }

    public void printMessage(){
        System.out.print("Factory name is " + factoryName+" ");
    }
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
