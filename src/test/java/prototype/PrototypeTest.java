package prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/20/17.
 */
public class PrototypeTest {
    @Test
    public void test(){
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("Prototype");
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        prototype.setList(list);
        for (int i = 0; i <10 ; i++) {
            ConcretePrototype prototype1 = (ConcretePrototype) prototype.clone();
            prototype.print();
            System.out.println(prototype1.hashCode());
            System.out.println(prototype.getList().hashCode());
            System.out.println(prototype.getName().hashCode());

        }
    }

}