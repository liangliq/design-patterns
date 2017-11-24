package decorator;

/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class AbstractDecorator implements IComponent {
    private IComponent component;

    public AbstractDecorator(IComponent component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
