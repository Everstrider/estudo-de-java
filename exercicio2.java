import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        System.out.printf("1 - Álcool%n2 - Gasolina%n3 - Diesel%n4 - Fim%n");
        System.out.printf("Digite o combustível desejado para abastecer o veículo:%n");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool += 1;
                    System.out.printf("Álcool: %d%n", alcool);
                    tipo = sc.nextInt();
                    break;
                case 2:
                    gasolina += 1;
                    System.out.printf("Gasolina: %d%n", gasolina);
                    tipo = sc.nextInt();
                    break;
                case 3:
                    diesel += 1;
                    System.out.printf("Diesel: %d%n", diesel);
                    tipo = sc.nextInt();
                    break;
                default:
                    System.out.printf("Código inválido, digite outro:%n");
                    tipo = sc.nextInt();
            }
        }
        System.out.println("Muito Obrigado!");

        sc.close();
    }
}