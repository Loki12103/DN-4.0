package EcommerceSearch;

import java.util.*;

public class SearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product(1, "Phone", "Electronics"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "T-shirt", "Clothing")
        };


        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        Product result1 = ProductSearch.linearSearch(products, searchName);
        System.out.println("\nLinear Search Result:");
        System.out.println(result1 != null ? result1 : "Product not found");
 
        ProductSearch.sortProducts(products);
        Product result2 = ProductSearch.binarySearch(products, searchName);
        System.out.println("\nBinary Search Result:");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
