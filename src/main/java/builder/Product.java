package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class Product {
    private String name;
    private int money;

    public Product Name(String name) {
        this.name = name;
        return this;
    }

    public Product Money(int money) {
        this.money = money;
        return this;
    }

    public void Print(){
        System.out.println("Product name is " + name + " and price is " + money);
    }

}
