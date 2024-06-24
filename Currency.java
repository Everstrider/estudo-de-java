package Application;
import java.util.Scanner;
import util.Conversion;

public class Currency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? %.2f%n", Conversion.DOLLAR_PRICE);

        System.out.println("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in BRL: %.2f%n", Conversion.convert(quantity));

        sc.close();
    }
}
