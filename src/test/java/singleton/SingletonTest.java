package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/14/17.
 */
public class SingletonTest {

    @Test
    public void Test(){

        Singleton singletonA = Singleton.getINSTANCE();
        Singleton singletonB = Singleton.getINSTANCE();
        if (singletonA.equals(singletonB)) {
            System.out.println("singletonA is equal to singletonB");

        }

        EagerSingleton eagerSingletonA = EagerSingleton.getInstance();
        EagerSingleton eagerSingletonB = EagerSingleton.getInstance();
        if (eagerSingletonA.equals(eagerSingletonB)) {
            System.out.println("eagerSingletonA is equal to eagerSingletonB");
        }

        MyThread[] myThread = new MyThread[10];
        for(int i = 0 ; i < myThread.length ; i++){
            myThread[i] = new MyThread();

        }

        for (int j = 0; j < myThread.length; j++) {
            myThread[j].start();
        }


    }

}