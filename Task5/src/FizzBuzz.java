import java.sql.SQLOutput;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //declare scanner
        Scanner keyboard = new Scanner(System.in);

        //declare variables and ask user for 2 values
        System.out.println("Please enter two values");
        int inputA = keyboard.nextInt();
        int inputB = keyboard.nextInt();

        //for loop to check whether the values in between the two that were given by user are divisible by 3 or 5
        for (int i = inputA; i <= inputB; i++) {

            if (i % 3 == 0 && i % 5 != 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 && i % 3 != 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(i);
            }
        }


    }
}
