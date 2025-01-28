/*
 * Faça algoritmo que leia o nome e a idade de uma pesoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade
 * */
package exercise13;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print(name + " is ");

        if (age >= 18) {
            System.out.println("of legal age");
        } else {
            System.out.println("a minor");
        }
    }
}
