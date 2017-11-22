package adapter;

/**
 * Created by cpekl-ddim-2 on 11/22/17.
 */
public class Adapter extends Target {
    public Adaptee adaptee;

    public  Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    void print() {
        adaptee.print();
    }
}
