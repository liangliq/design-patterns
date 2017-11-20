package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class ConcreteFactoryB extends AbstractFactory {

    public ConcreteFactoryB() {
        this.setFactoryName("FactoryB");
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
