import java.sql.SQLOutput;
import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {

        //delcare scanner
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int input;
        int total = 0;
        System.out.println("Please enter a value");

        //input variable
        input = keyboard.nextInt();

        //Check if the value is greater than zero
        while (input < 0)
        {
            System.out.println("Please enter a positive value");
            input = keyboard.nextInt();
        }

        //while loop to check that the input does not equal 0
        do {
           total+=input;
            input--;

        }while (input != 0);

        //output the sum of the numbers adding up to the number that was inputed by the user
        System.out.println("The sum of the numbers adding up to your number is: " + total);
    }
}
