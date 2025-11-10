package TP2;
import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu nome completo: ");
            String nome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome da sua mãe: ");
            String mae = sc.nextLine();

            System.out.print("Digite o nome do seu pai: ");
            String pai = sc.nextLine();

            System.out.println("\n=== DADOS CADASTRADOS ===");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Mãe: " + mae);
            System.out.println("Pai: " + pai);

            if (nome.length() > mae.length() && nome.length() > pai.length()) {
                System.out.println("Seu nome é o mais longo entre os três.");
            } else if (mae.length() > pai.length()) {
                System.out.println("O nome da sua mãe é o mais longo.");
            } else {
                System.out.println("O nome do seu pai é o mais longo.");
            }

            sc.close();
        }
}
