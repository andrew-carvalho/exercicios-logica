/*
 * Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente
 * */
package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        int[] values = {a, b, c};
        Arrays.sort(values);

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
