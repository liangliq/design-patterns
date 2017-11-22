package adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class AdapterTest {

    @Test
    public void test(){
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.print();
    }

}