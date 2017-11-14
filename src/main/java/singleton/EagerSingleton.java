package singleton;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
