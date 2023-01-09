import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VendingMachine {
    private static List<Product> products = new ArrayList<>();

    public static void fillList(){
        for (int i = 0; i < 4; i++) {
            products.add(new Product(i));
        }
    }

    public static void print(){
        System.out.println("---+---------------+---------+\n"+
                " # |      Name     |   Price |");
        int number = 0;

        for (Product product : products) {
            number++;
            System.out.printf(" %s | %-13s | %-7s |%n", number, product.getName(),
                    product.getPrice());
        }
        System.out.println("---+---------------+---------+");

    }

    public static void cash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, put your money:");
        int cash = sc.nextInt();
        var checked = products.stream().filter(m -> m.getPrice()<=cash).collect(Collectors.toList());
        System.out.println("Available: ");
        checked.forEach(System.out::println);

    }


}
