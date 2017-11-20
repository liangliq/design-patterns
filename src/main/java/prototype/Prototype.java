package prototype;

import java.util.ArrayList;

/**
 * Created by cpekl-ddim-2 on 11/20/17.
 */
public abstract class Prototype implements Cloneable{

    private ArrayList list = new ArrayList();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            prototype.list = (ArrayList) this.list.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
        return prototype;
    }
}
