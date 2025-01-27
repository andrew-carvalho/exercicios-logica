/*
 * Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
 * */
package exercise01;

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

        int sum = a + b;

        System.out.printf("%d + %d = %d\n", a, b, sum);

        if (sum > c) {
            System.out.printf("%d > %d", sum, c);
        }
    }
}
