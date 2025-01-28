/**
 * Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles
 */
package exercise22;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        double divisionResult = (double) a / b;
        int divisionRest = a % b;

        System.out.printf("%d / %d = %.2f\n", a, b, divisionResult);
        System.out.printf("%d %% %d = %d\n", a, b, divisionRest);
    }
}
