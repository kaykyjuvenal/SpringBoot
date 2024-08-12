package org.br.edu.ifsp;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu filme favorito: ");
        String filme = entrada.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = entrada.nextInt();
        System.out.println("Qual nota você daria para o filme? De 0 à 10");
        int nota = entrada.nextInt();

        System.out.println("O filme favorito é: " + filme + "\nO ano de lançamento é: " + anoDeLancamento
        + "\nA avalição desse filme é: " + nota);

    }
}
