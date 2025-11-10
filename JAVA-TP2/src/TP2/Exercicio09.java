import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senha = sc.nextLine();
        String confirmacao;

        do {
            System.out.print("Digite novamente a senha: ");
            confirmacao = sc.nextLine();
        } while (!senha.equals(confirmacao));

        System.out.println("Senha confirmada com sucesso!");
        sc.close();
    }
}
