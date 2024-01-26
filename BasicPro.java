// Importing necessary classes from java standard library
import java.util.Scanner;

// Main class declaration
public class BasicPro {
    // Main method, entry point of the program
    public static void main(String[] args){
        
// Create a scanner object to take input from the user.
        Scanner scanner= new Scanner(System.in);

// Prompt user to enter the name.
        System.out.println("Enter your name: ");

// Take the name as input
        String name = scanner.nextLine();
        
// Print welcome message.
        System.out.println("Welcome "+name+" !");
// Close the scanner.
        scanner.close();
    }
}
