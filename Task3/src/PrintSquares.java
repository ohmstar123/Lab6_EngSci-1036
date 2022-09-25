import java.util.Scanner;

public class PrintSquares {
    public static void main(String[] args) {

        //Declare scanner
        Scanner keyboard = new Scanner(System.in);

        //Declare variables
        int input;
        int counter = 1;
        int counterCounter = 3;

        //Ask user for input
        System.out.println("Please enter a value");
        input = keyboard.nextInt();

        System.out.println("All the square rootable number before your number are: ");

        //Find all the square rootable number before the value that was given by the user
        while (counter <= input)
        {

            System.out.print(counter + ", ");
            counter = counter + counterCounter;
            counterCounter+=2;
        }
    }
}
