package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class Director {

    private AbstractBuilder builder;

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }
    public Product construct(){
        builder.BuildProduct();
        return builder.getProduct();
    }

    public Director() {
    }
}
