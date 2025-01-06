import java.util.Scanner;   // Import the scanner class to take input from user input
class First {   // Define main class
    public static void main(String[] args) {   // The main method where the program starts
        double area, r;   // Declare two double variable 
        Scanner sc = new Scanner(System.in);  // Create a scanner object to take user input
        System.out.println("Enter radius");   // Prompt the user to enter the radius
        r = sc.nextDouble();   // Read the radius value and store it in variable 'r'
        area = 3.14159*r*r;   // Formula to calculate the area
        System.out.println("Area is "+area);  // 
    }
}
