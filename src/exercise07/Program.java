/*
 * Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO
 * */
package exercise07;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First value: ");
        boolean firstValue = scanner.nextBoolean();

        System.out.print("Second value: ");
        boolean secondValue = scanner.nextBoolean();

        if (firstValue && secondValue) {
            System.out.println("Both true");
        } else if (!firstValue && !secondValue) {
            System.out.println("Both false");
        }
    }
}
