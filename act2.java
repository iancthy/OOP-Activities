class Book {
    private String title;
    private int age;

    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }
    public int getAge() {
        return age;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 25);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAge());
    }
}
