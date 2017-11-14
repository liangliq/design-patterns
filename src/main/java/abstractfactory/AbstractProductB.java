package abstractfactory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class AbstractProductB {
    private String typeName;

    public AbstractProductB TypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public void PrintMessage(){
        System.out.println("Product type is " + typeName);
    }
}
