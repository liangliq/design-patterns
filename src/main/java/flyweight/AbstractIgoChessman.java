package flyweight;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public abstract class AbstractIgoChessman {

    public abstract String getColor();

    public void display(){
        System.out.println("Color is "+this.getColor());
    }
}
