/*
 * Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 * */
package exercise04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        int successor = number + 1;
        System.out.printf("Successor: %d\n", successor);

        int predecessor = number - 1;
        System.out.printf("Predecessor: %d\n", predecessor);
    }
}
