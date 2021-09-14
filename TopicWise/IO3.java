
import java.util.Scanner;
// In order to use the object of Scanner, we need to import java.util.Scanner package.
// get input from user using the object of Scanner class.

class IO3 {
    public static void main(String[] args) {

        /*
         * Difference between println(), print() and printf()
         * 
         * print() - It prints string inside the quotes. 
         * println() - It prints string
         * inside the quotes similar like print() method. Then the cursor moves to the
         * beginning of the next line. 
         * printf() - It provides string formatting (similar
         * to printf in C/C++ programming).
         * 
         */

        System.out.println("Java programming is interesting.");

        Double number = -10.36;
        System.out.println("Number = " + number);
            
        // create an object of Scanner 
        Scanner input = new Scanner(System.in);

        // taking the input from the user 
        int no = input.nextInt();




    }
}
