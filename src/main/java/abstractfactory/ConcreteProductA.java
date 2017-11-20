package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class ConcreteProductA extends AbstractProductA {

    public ConcreteProductA() {
        this.setTypeName("A");
        this.printMessage();
    }
}
