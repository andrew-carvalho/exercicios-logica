/*
 * Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
 * caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
 * imprimir seu valor na tela.
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

        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.printf("C: %d", c);
    }
}
