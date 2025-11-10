import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();
        double desconto = 0;

        if (valor > 1000) {
            desconto = 0.10;
        } else if (valor >= 500) {
            desconto = 0.05;
        }

        double valorFinal = valor - (valor * desconto);
        System.out.println("\nValor original: R$ " + valor);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}
