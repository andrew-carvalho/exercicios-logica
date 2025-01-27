/*
 * Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
 * */
package exercise02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.print("Even ");
        } else {
            System.out.print("Odd ");
        }

        if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
