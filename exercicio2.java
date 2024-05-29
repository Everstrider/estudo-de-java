import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, num2;
        double total;

        System.out.printf("1 - Cachorro Quente - R$4.00%n2 - X-Salada - R$4.50%n3 - X-Bacon 0 R$5.00%n4 - Torrada Simples - R$2.00%n5 - Refrigerante - R$1,50%n");
        System.out.printf("Digite o código do produto a ser pedido:%n");
        num = sc.nextInt();
        System.out.println("Quantos você deseja?");
        num2 = sc.nextInt();

        switch (num) {
            case 1:
                total = num2 * 4.00;
                System.out.printf("O total a pagar é: R$%.2f", total);
                break;
            case 2:
                total = num2 * 4.50;
                System.out.printf("O total a pagar é: R$%.2f", total);
                break;
            case 3:
                total = num2 * 5.00;
                System.out.printf("O total a pagar é: R$%.2f", total);
                break;
            case 4:
                total = num2 * 2.00;
                System.out.printf("O total a pagar é: R$%.2f", total);
                break;
            case 5:
                total = num2 * 1.50;
                System.out.printf("O total a pagar é: R$%.2f", total);
                break;
            default:
                System.out.println("Número Inválido");
        }



        sc.close();
        }
    }
