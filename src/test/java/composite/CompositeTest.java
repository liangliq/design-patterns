package composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/24/17.
 */
public class CompositeTest {

    @Test
    public void test(){
        LeafA leafA = new LeafA().setName("LeafA");
        LeafB leafB = new LeafB().setName("LeafB");
        LeafC leafC = new LeafC().setName("LeafC");
        Composite composite = new Composite();
        composite.addLeaf(leafA);
        composite.addLeaf(leafB);
        composite.addLeaf(leafC);
        composite.operation();

    }

}