/*
 * Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
 * Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
 * */
package exercise18;

public class Program {
    public static void main(String[] args) {
        double franciscoHeight = 1.50;
        double franciscoHeightIncreaseRate = 0.02;

        double saraHeight = 1.10;
        double saraHeightIncreaseRate = 0.03;

        int years = 0;

        while (franciscoHeight > saraHeight) {
            franciscoHeight += franciscoHeightIncreaseRate;
            saraHeight += saraHeightIncreaseRate;
            years++;
        }

        System.out.println("It will be necessary " + years + " years to Sara surpass Francisco in height");
    }
}
