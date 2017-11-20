package builder;

/**
 * Created by cpekl-ddim-2 on 11/15/17.
 */
public class Product {
    private String name;
    private int money;

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setMoney(int money) {
        this.money = money;
        return this;
    }

    public void print(){
        System.out.println("Product name is " + name + " and price is " + money);
    }

}
