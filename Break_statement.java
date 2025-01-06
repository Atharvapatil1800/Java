public class Break_statement {     // Defne main class
        public static void main(String[] args) {   //The main metod where the program starts
            int i=1;   // Dcleration of integer 'i' with value 1
            while (i<=10){   // while loop to print number from 1 to 10
                System.out.println(i);   // Print the current value of i
                if (i==5){   // check if i equal to 5
                    break;  // Exit the while loop
                }
                i++;  // Increment of i by 1
            }
        }
    }


