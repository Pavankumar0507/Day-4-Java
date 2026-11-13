
import java.util.LinkedHashSet;

public class Recntvwpdt {
    public static void main(String[] args) {
        LinkedHashSet<String> products = new LinkedHashSet<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Smart Watch");

        System.out.println("Recently Viewed Products:");
        System.out.println(products);
        products.add("Laptop");
        System.out.println("\nAfter adding Laptop again:");
        System.out.println(products);
        products.remove("Headphones");
        products.add("Tablet");
        if (products.contains("Mobile")) {
            System.out.println("\nMobile exists in the list.");
        } else {
            System.out.println("\nMobile does not exist.");
        }

        // 7. Display final product list
        System.out.println("\nFinal Product List:");

        for (String product : products) {
            System.out.println(product);
        }
    }
}
