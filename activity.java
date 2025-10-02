class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling");

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
