import java.util.Scanner;

class activity1{
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Input a number: ");
    double num1 = scanner.nextDouble();
    
    if (num1 % 2 == 0){
        System.out.println("Even");
    } else{
        System.out.println("Odd");
     
        }   
    }
}   
