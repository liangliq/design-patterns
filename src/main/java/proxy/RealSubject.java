package proxy;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public class RealSubject extends Subject {

    @Override
    public void printMessage() {
        System.out.println("Real message");
    }
}
