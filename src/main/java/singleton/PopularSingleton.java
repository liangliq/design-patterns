package singleton;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class PopularSingleton {

    private PopularSingleton(){

    }

    private static class SingletonHolder{
        private static final PopularSingleton INSTANCE = new PopularSingleton();

    }

    public PopularSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
