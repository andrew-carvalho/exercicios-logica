/*
 * Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%
 * */
package exercise06;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value: ");
        double value = scanner.nextDouble();

        double rate = 0.05;

        double readjustedValue = value + (value * rate);
        System.out.printf("Readjusted value: %.2f", readjustedValue);
    }
}
