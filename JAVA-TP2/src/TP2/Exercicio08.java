import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }

        sc.close();
    }
}
