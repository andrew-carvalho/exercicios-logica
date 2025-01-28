/*
 * Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
 * */
package exercise24;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double gasConsumptionPerKilometer = 12;

        System.out.print("Distance travelled: ");
        double distanceInKilometer = scanner.nextDouble();

        double gasUsed = distanceInKilometer / gasConsumptionPerKilometer;
        System.out.printf("You will use %.2f liters of gas\n", gasUsed);
    }
}
