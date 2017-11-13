package simplefactory;

/**
 * Created by cpekl-ddim-2 on 11/13/17.
 */
public class SimpleFactory {

    public static AbstractAnimals Animals(String StrAnimals) {

        AbstractAnimals animals = null;
        if (StrAnimals.equals("Cats")){

            animals = new Cats();
        }
        if (StrAnimals.equals("Dogs")){

            animals = new Dogs();
        }
        return animals;
    }
}
