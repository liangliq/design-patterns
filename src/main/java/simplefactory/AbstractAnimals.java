package simplefactory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public abstract class AbstractAnimals {
    private String name;
    private String language;

    public void saying(){
        System.out.println("I am a "+name+" and using "+language);
    }
    public AbstractAnimals setName (String name){
        this.name = name;
        return this;
    }
    public AbstractAnimals setLanguage(String language){
        this.language = language;
        return this;
    }
}
