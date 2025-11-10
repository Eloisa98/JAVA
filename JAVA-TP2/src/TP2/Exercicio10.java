import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou!");
        sc.close();
    }
}
