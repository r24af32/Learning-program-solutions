public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "T-shirt", "Clothing"),
            new Product(105, "Watch", "Accessories")
        };

        // Linear Search
        String searchTerm = "Laptop";
        Product result1 = SearchService.linearSearch(products, searchTerm);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Sort before Binary Search
        SearchService.sortByProductName(products);

        // Binary Search
        Product result2 = SearchService.binarySearch(products, searchTerm);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
