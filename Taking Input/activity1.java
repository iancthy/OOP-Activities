import java.util.Scanner;

class activity1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.print("What is your favorite quote? ");
        String quote = scanner.nextLine();
        
        System.out.println("Hello there " + name + "! Your favorite quote is: " + quote);
    }
}
