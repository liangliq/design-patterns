package singleton;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class LazySingleton {

    private  static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    //Double check
    public static LazySingleton getInstance(){

        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }

        }
        return lazySingleton;
    }
}
