/*
 * Faça um algoritmo que imprima na tela a tabuada de 1 até 10
 * */
package exercise19;

public class Program {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%d x %d = %d\n", i, y, (i * y));
            }
            System.out.println();
        }
    }
}
