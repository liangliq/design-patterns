package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class AbstractProductA {
    private String typeName;

    public AbstractProductA setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public void printMessage(){
        System.out.println("Product type is " + typeName);
    }
}
