/*
 * Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
 * Fórmula: C = (5 * ( F-32) / 9)
 * */
package exercise17;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);
        System.out.printf("%.2fF = %.2fC", fahrenheit, celsius);
    }
}
