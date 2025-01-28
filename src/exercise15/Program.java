/*
 * Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
 * consideração o ano com 365 dias e o mês com 30 dias.
 * */
package exercise15;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year of birth: ");
        int year = scanner.nextInt();

        int currentYear = 2025;

        int years = currentYear - year;
        int days = years * 365;
        int months = years * 12;

        System.out.printf("%d years = %d days = %d months\n", years, days, months);
    }
}
