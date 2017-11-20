package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class ConcreteFactoryA extends AbstractFactory {

    public ConcreteFactoryA() {
        this.setFactoryName("FactoryA");
    }

    @Override
    public AbstractProductA createProductA() {
        this.printMessage();
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        this.printMessage();
        return new ConcreteProductB();
    }

}
