import java.util.Scanner;
import entities.Product;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Product product = new Product();

         System.out.printf("Enter product data:%n");
         System.out.print("Name: ");
         product.name = sc.nextLine();
         System.out.print("Price: ");
         product.price = sc.nextDouble();
         System.out.print("Quantity in stock: ");
         product.quantity = sc.nextInt();

         System.out.println("Product data: " + product.toString());
         System.out.println("Type 1 to add products, 2 to remove them or 3 to stop: ");
         int choice = sc.nextInt();

         while (choice != 3) {
             switch (choice) {
                 case 1:
                     System.out.print("Enter the number of products to be added in stock: ");
                     int quantity = sc.nextInt();
                     product.addProducts(quantity);
                     System.out.println("Updated data: " + product.toString());
                     System.out.println("Type 1 to add products, 2 to remove them or 3 to stop: ");
                     choice = sc.nextInt();
                     break;
                 case 2:
                     System.out.print("Enter the number of products to be removed from stock: ");
                     quantity = sc.nextInt();
                     product.removeProducts(quantity);
                     System.out.println("Updated data: " + product.toString());
                     System.out.println("Type 1 to add products, 2 to remove them or 3 to stop: ");
                     choice = sc.nextInt();
                     break;
                  default:
                     System.out.println("Invalid Number.");
                     System.out.println("Type 1 to add products, 2 to remove them or 3 to stop: ");
                     choice = sc.nextInt();
                     break;
             }
         }
         System.out.println("Closing the program.");

         sc.close();
        }
    }
