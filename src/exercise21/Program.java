/*
 * Faça um algoritmo que mostre um valor aleatório entre 0 e 100
 * */
package exercise21;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(0, 101);
        System.out.println(number);
    }
}
