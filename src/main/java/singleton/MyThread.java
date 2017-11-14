package singleton;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance().hashCode());
    }


}
