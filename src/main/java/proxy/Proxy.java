package proxy;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public class Proxy extends Subject {

    RealSubject realSubject = new RealSubject();

    private void before(){
        System.out.print("It is ");
    }
    @Override
    public void printMessage() {
        before();
        realSubject.printMessage();
    }
}
