/*
 * Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
 * de acordo com a tabela abaixo:
 * Fórmula do IMC = peso / (altura) ²
 *
 * Tabela Condições IMC:
 * Abaixo de 18,5   | Abaixo do peso
 * Entre 18,6 e 24,9 | Peso ideal (parabéns)
 * Entre 25,0 e 29,9 | Levemente acima do peso
 * Entre 30,0 e 34,9 | Obesidade grau I
 * Entre 35,0 e 39,9 | Obesidade grau II (severa)
 * Maior ou igual a 40 | Obesidade grau III (mórbida)
 * */
package exercise09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        System.out.print("Weight: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.6 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obesity class I");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Obesity class II");
        } else if (bmi >= 40) {
            System.out.println("Obesity class III");
        }
    }
}
