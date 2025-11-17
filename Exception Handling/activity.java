import java.util.Scanner;

public class EnumDaysExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., MONDAY): ");

        String input = scanner.nextLine().toUpperCase();

        try {
            Day today = Day.valueOf(input);

            System.out.println("You selected: " + today);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid day entered!");
            System.out.println("Please enter a valid day like MONDAY, TUESDAY, etc.");
        }

        scanner.close();
    }
}
