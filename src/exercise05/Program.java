/*
 * Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
 * usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
 * */
package exercise05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double minimumWage = 1293.20;

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        double minimumWageQuantity = salary / minimumWage;
        System.out.printf("This salary corresponds to %.2f minimum wages", minimumWageQuantity);
    }
}
