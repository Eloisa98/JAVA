import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: R$ ");
        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 20000) {
            imposto = 0;
        } else if (salario <= 40000) {
            imposto = (salario - 20000) * 0.1;
        } else if (salario <= 80000) {
            imposto = (20000 * 0.1) + (salario - 40000) * 0.2;
        } else {
            imposto = (20000 * 0.1) + (40000 * 0.2) + (salario - 80000) * 0.3;
        }

        double liquido = salario - imposto;

        System.out.println("\nImposto a pagar: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + liquido);

        sc.close();
    }
}
