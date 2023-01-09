import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    private static final List<String> names = List.of("BananaChips", "Candy", "Water", "Coca-cola");

    public Product(int i) {
        Random rnd = new Random();
        name = names.get(i);
        price = rnd.nextInt(36)+5;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
