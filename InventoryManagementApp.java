import java.util.ArrayList;
import java.util.Scanner;

class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, int price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.print("Product Added: " + name + " - Price: Php " + price + "\n");
    }

    public void displayProducts() {
        if(products.isEmpty()){
            System.out.println("No products available!");
        }else{
            for(Product product : products){
                System.out.println(product.getName() + " - Price: Php " + product.getPrice());
            }
        }
    }
}

class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { 
        return name;
    }

    public int getPrice() {
        return price;
    }
}


public class InventoryManagementApp{
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Inventory Management System\nBy Justine B. Gomez");

        while(true){
            System.out.println("\nMenu: ");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();
            sc.nextLine();

            switch(userChoice){
                case 1:
                    System.out.println("-------------------------");
                    System.out.print("Enter Product name: ");
                    String product = sc.nextLine();
                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();
                    ims.addProduct(product, price);

                break;

                case 2:
                    System.out.println("\n--------------------");
                    ims.displayProducts();
                break;

                case 3:
                    System.out.println("\nThank you for using the Inventory Management System!");
                    sc.close();
                    return;
            }

        }
    }
}
