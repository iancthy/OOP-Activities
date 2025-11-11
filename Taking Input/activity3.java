import java.util.Scanner;

class activity3{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("---Circle Calculator---");
    
    System.out.print("Input the radius: ");
    double radius = scanner.nextDouble();
    double pi = Math.PI;
    double exponent = Math.pow(radius, 2);
    
    double area = pi*exponent;
    
    System.out.println("The area of your circle is "+ String.format("%.4f", area));
    
    }
}
