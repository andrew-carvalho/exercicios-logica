/*
 * Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada
 * */
package exercise20;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, (number * i));
        }
    }
}
