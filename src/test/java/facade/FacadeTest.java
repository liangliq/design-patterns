package facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/27/17.
 */
public class FacadeTest {

    @Test
    public void test(){
        Facade facade = new Facade();
        facade.execcute();
    }

}