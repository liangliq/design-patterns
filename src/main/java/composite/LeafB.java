package composite;

/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class LeafB extends Component {
    private String name;
    public LeafB setName(String name){
        this.name = name;
        return this;
    }

    @Override
    public void operation() {
        System.out.println("Operation " + name);
    }
}
