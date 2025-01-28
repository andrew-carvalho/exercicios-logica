/*
 * Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
 * equilátero, isósceles ou escaleno.
 * */
package exercise16;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.print("C: ");
        double c = scanner.nextDouble();

        double[] sides = {a, b, c};
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            System.out.println("Invalid Triangle!");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
