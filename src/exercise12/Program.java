/*
 * Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 * pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 *
 * Tabela de Código de Condições de Pagamento
 * 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 * 2 - À Vista no cartão de crédito, recebe 10% de desconto
 * 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 * 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 * */
package exercise12;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product value: ");
        double productValue = scanner.nextDouble();

        System.out.println("Payment Methods:");
        System.out.println("1 - Cash");
        System.out.println("2 - Cash on credit card");
        System.out.println("3 - Paid in two installments");
        System.out.println("4 - Paid in three or more installments");
        System.out.print("Choose the payment method [1-4]: ");
        int paymentMethod = scanner.nextInt();

        double totalToPay = productValue;

        switch (paymentMethod) {
            case 1:
                totalToPay -= totalToPay * 0.15;
                break;
            case 2:
                totalToPay -= totalToPay * 0.10;
                break;
            case 3:
                break;
            case 4:
                totalToPay += totalToPay * 0.10;
                break;
            default:
                System.out.println("Invalid payment method!");
                break;
        }

        System.out.printf("Total to pay: %.2f", totalToPay);
    }
}
