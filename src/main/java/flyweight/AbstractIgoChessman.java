package flyweight;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public abstract class AbstractIgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("Color is "+this.getColor()+" Position X:"+coordinates.getX()+" Y:"+coordinates.getY());
    }
}
