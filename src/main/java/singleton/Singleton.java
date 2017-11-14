package singleton;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class Singleton {

    private String name;

    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    //Note:Singleton will be recreate in multiple thread environment
    public static Singleton getINSTANCE(){

        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }

    public void Print(){
        System.out.println("Singleton name is " + name);
    }
}
