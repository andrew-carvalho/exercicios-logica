package exercise10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First grade: ");
        double firstGrade = scanner.nextDouble();

        System.out.print("Second grade: ");
        double secondGrade = scanner.nextDouble();

        System.out.print("Third grade: ");
        double thirdGrade = scanner.nextDouble();

        double sum = firstGrade + secondGrade + thirdGrade;
        double gradeAverage = sum / 3;

        System.out.printf("Grade avarage: %.2f\n", gradeAverage);
    }
}
