package facade;

/**
 * Created by cpekl-ddim-2 on 11/27/17.
 */
public class Facade {

    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void execcute(){
        systemA.printA();
        systemB.printB();
        systemC.printC();
    }
}
