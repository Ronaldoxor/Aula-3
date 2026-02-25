package ex4;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da transação: ");
        String number = input.nextLine();

        System.out.print("Digite a descrição do item da transação: ");
        String description = input.nextLine();

        System.out.print("Digite a quantidade do item da transação: ");
        int quantity = input.nextInt();

        System.out.print("Digite o preço do item da transação: ");
        double itemPrice = input.nextDouble();

        Invoice invoice = new Invoice(number,description,quantity,itemPrice);

        System.out.println("\n--- Dados da Transação ---");
        System.out.println("Número: " + invoice.getNumber());
        System.out.println("Descrição: " + invoice.getDescription());
        System.out.println("Quantidade: " + invoice.getQuantity());
        System.out.printf("Preço do Item: R$ %.2f%n" ,invoice.getItemPrice());
        System.out.println("Valor Total da Transação: " + invoice.getInvoiceAmount());

        input.close();
    }
}