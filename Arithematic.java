import java.util.Scanner;    // Import the Scanner class to take input from the user

public class Arithematic    // Define the main class 
{
        public static void main(String[] args) {   // The main method where the program starts 
            Scanner sc = new Scanner(System.in);   // Create the scanner object to read user input
            System.out.println("Enter first number");  // Prompt the user to enter the first number
            int a= sc.nextInt();   // Read the first number as an integer and store it in variable 'a'
            System.out.println("Enter second number");  // Prompt the user to enter the second number
            int b= sc.nextInt();   // Read the second number as an integer and store it in variable 'b'

            // Display a menu of operation to the user
            System.out.println("Choose any option");     
            System.out.println("1. Addition");   // Option 1 for addition
            System.out.println("2. Subtraction");  // Option 2 for substraction
            System.out.println("3. Multiplication");  // Option 3 for multiplication
            System.out.println("4. Division");  // Option 4 for division
                
            System.out.println("Enter your choice");   // Ask the user to select an operation
            int c= sc.nextInt();    // Read the user's choice and store it in variable 'c'

            // Use switch statement to perform the selected operation
            switch (c){ 
                case 1:  // If the choice is 1
                    System.out.println("Addition: " + (a+b));   // Add the two numbers and display the result 
                    break;   // Exit the switch block
                case 2:  // If the choice is 2
                    System.out.println("Subtraction: " + (a-b));   // Substract the two numbers and display the result
                    break;   // Exit the switch block
                case 3:  // If the choice is 3
                    System.out.println("Multiplication: " + (a*b));   // Multiply the two number and display the result
                    break;  // Exit the switch block
                case 4:  // If the choice is 4
                    System.out.println("Division: " + (a/b));   // Divide the two numbers and display the result
                    break;  // Exit the switch block
                default:   // If the user enters the invalid choice
                    System.out.println("Enter valid number: ");   // Inform the user of invalid choice
            }
        }
    }

