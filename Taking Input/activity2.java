import java.util.Scanner;

class activity2{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("---WELCOME TO THE CALCULATOR---");
    
    System.out.print("Enter a number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int num2 = scanner.nextInt();
    
    int add = num1 + num2;
    int minus = num1 - num2;
    int multiply = num1 * num2;
    int divide = num1 / num2;
    

    System.out.println("Addition: "+add);
    System.out.println("Substraction: "+minus);    
    System.out.println("Multiplication: "+multiply);
    System.out.println("Division: "+divide);  
    
    }
}
