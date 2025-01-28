/*
 * Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 * se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 * */
package exercise11;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student name: ");
        String studentName = scanner.nextLine();

        System.out.print("First grade: ");
        double firstGrade = scanner.nextDouble();

        System.out.print("Second grade: ");
        double secondGrade = scanner.nextDouble();

        System.out.print("Third grade: ");
        double thirdGrade = scanner.nextDouble();

        System.out.print("Fourth grade: ");
        double fourthGrade = scanner.nextDouble();

        double sum = firstGrade + secondGrade + thirdGrade + fourthGrade;
        double gradeAverage = sum / 4;

        System.out.print("Student " + studentName + " ");

        if (gradeAverage >= 7) {
            System.out.println("approved!");
        } else {
            System.out.println("reproved!");
        }
    }
}
