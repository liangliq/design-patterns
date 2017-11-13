package simplefactory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public abstract class AbstractAnimals {
    private String name;
    private String language;

    public void Saying(){
        System.out.println("I am a "+name+" and using "+language);
    }
    public AbstractAnimals Name (String name){
        this.name = name;
        return this;
    }
    public AbstractAnimals Language(String language){
        this.language = language;
        return this;
    }
}
