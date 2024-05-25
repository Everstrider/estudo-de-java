import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      float a, b, c;
      int q = 2;
      double PI = 3.14159;
      double tri, cir, tra, qua, ret;
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();

      tri = a * c / 2;
      cir = PI * Math.pow(c, q);
      tra = (a + b) * c / 2;
      qua = b * b;
      ret = a * b;
      System.out.printf("A área do triângulo retângulo é: %.3f%n", tri);
      System.out.printf("A área do círculo é: %.3f%n", cir);
      System.out.printf("A área do trapézio é: %.3f%n", tra);
      System.out.printf("A área do quadrado é: %.3f%n", qua);
      System.out.printf("A área do retângulo é: %.3f%n", ret);




      sc.close();

        }
    }
