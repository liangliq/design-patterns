package command;

/**
 * Created by cpekl-ddim-2 on 11/30/17.
 */
public class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void action(){

        System.out.println(name+" action ");
    }

    public void sayname(){
        System.out.println("This is "+name);
    }
}
