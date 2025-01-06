import java.util.Scanner;   // Import the scanner class to take input from user input
class First {   // Define main class
    public static void main(String[] args) {   // The main method where the program starts
        double area, r;   // Declare two double variable 
        Scanner sc = new Scanner(System.in);  // create a scanner object to take user input
        System.out.println("Enter radius");
        r = sc.nextDouble();
        area = 3.14159*r*r;
        System.out.println("Area is "+area);
    }
}
