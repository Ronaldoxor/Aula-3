package ex1;

/**
 * Representa um livro no sistema de inventário.
 *
 * @author Ronaldo Aparecido Monteiro Almeida
 */
public class Book {

    private String title;
    private String author;
    private double price;

    /**
     * Constrói um objeto Book com título, autor e preço.
     *
     * @param title  título do livro
     * @param author autor do livro
     * @param price  preço do livro
     */
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // chamada ao setter para garantir validação
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}