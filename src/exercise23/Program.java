/*
 * Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
 * As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
 * Imprima na tela o salário líquido final.
 * */
package exercise23;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hour value: ");
        double hourValue = scanner.nextDouble();

        System.out.print("Number of classes: ");
        int numberOfClasses = scanner.nextInt();

        System.out.print("Tax discount (percentage): ");
        int taxDiscountInPercentage = scanner.nextInt();

        double netSalary = (hourValue * numberOfClasses);
        netSalary -= ((double) taxDiscountInPercentage / 100) * netSalary;

        System.out.printf("Net salary: %.2f\n", netSalary);
    }
}
