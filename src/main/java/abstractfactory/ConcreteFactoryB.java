package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class ConcreteFactoryB extends AbstractFactory {

    public ConcreteFactoryB() {
        this.FactoryName("FactoryB");
    }

    @Override
    public AbstractProductA CreateProductA() {
        this.PrintMessage();
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB CreateProductB() {
        this.PrintMessage();
        return new ConcreteProductB();
    }

}
