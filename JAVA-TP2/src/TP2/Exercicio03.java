import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar = 5.50, euro = 6.00, libra = 7.00;

        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();
        sc.nextLine();

        System.out.print("Escolha a moeda de destino (dólar/euro/libra): ");
        String moeda = sc.nextLine().toLowerCase();

        double convertido = 0;
        switch (moeda) {
            case "dolar":
                convertido = reais / dolar;
                break;
            case "euro":
                convertido = reais / euro;
                break;
            case "libra":
                convertido = reais / libra;
                break;
            default:
                System.out.println("Moeda inválida!");
                sc.close();
                return;
        }

        System.out.printf("Valor convertido: %.2f %s\n", convertido, moeda);
        sc.close();
    }
}
