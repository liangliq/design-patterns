package composite;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class Composite extends Component {

    public List leafList = new ArrayList();

    public void addLeaf(Component c) {
        leafList.add(c);
    }

    public void removeLeaf(Component c) {
        leafList.remove(c);
    }

    public Component getLeaf(int n) {
        if (null!=leafList.get(n)) {
            return (Component) leafList.get(n);
        }else{
            return null;

        }
    }

    @Override
    public void operation() {

        for (Object object : leafList) {
            ((Component)object).operation();
        }
    }
}
