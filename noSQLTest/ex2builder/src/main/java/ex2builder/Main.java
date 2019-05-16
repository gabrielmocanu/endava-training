package ex2builder;

public class Main {
    public static void main(String[] args) {
        Product p = new Product.Builder()
                        .setColor("red")
                        .setName("aa")
                        .setPrice(5)
                        .build();


    }
}
