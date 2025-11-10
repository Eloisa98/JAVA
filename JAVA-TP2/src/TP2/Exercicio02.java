package TP2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += sc.nextDouble();
        }

        double media = soma / 4;

        System.out.println("\nMédia final: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado!");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação!");
        } else {
            System.out.println("Situação: Reprovado!");
        }

        sc.close();
    }
}
