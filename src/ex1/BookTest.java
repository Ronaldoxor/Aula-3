package ex1;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String title = input.nextLine();

        System.out.print("Digite o autor do livro: ");
        String author = input.nextLine();

        System.out.print("Digite o preço do livro: ");
        double price = input.nextDouble();

        Book book = new Book(title, author, price);

        System.out.println("\n--- Estado final do livro ---");
        System.out.println("Título: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Preço: R$ " + book.getPrice());

        input.close();
    }
}
