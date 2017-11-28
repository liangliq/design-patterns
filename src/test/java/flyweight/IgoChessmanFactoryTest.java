package flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public class IgoChessmanFactoryTest {

    @Test
    public void test(){
        AbstractIgoChessman a = IgoChessmanFactory.getInstance().getIgoChessman("Black");
        AbstractIgoChessman b = IgoChessmanFactory.getInstance().getIgoChessman("White");
        AbstractIgoChessman c = IgoChessmanFactory.getInstance().getIgoChessman("Black");

        a.display(new Coordinates(1,2));
        b.display(new Coordinates(2,3));
        System.out.println("a==b:"+(a == b));
        a.display(new Coordinates(1,5));
        c.display(new Coordinates(3,6));
        System.out.println("a==c:"+(a == c));
    }

}