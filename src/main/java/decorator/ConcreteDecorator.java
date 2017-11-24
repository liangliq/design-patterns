package decorator;


/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(IComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        addNewDecoration();
    }

    public void addNewDecoration(){
        System.out.print(" added new decoration");
    }
}
