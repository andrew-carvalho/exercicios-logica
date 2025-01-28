/*
 * Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
 * */
package exercise03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        if (a == b) {
            int sum = a + b;
            System.out.printf("%d + %d = %d", a, b, sum);
        }
    }
}
