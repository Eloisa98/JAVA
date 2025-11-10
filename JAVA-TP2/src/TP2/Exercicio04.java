import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(nascimento, hoje);

        System.out.println("Você tem aproximadamente " + dias + " dias de vida.");
        sc.close();
    }
}
