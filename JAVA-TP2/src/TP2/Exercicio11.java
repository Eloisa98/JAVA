import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        System.out.print("Sequência: ");
        for (int i = inicio; i <= 100; i += incremento) {
            System.out.print(i);
            if (i + incremento <= 100) System.out.print(", ");
        }

        sc.close();
    }
}
