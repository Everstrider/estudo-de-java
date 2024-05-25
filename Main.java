/** Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */
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
