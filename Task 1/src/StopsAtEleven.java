import java.util.Scanner;

public class StopsAtEleven {
    public static void main(String[] args) {

        //Delcare variables
        int counter = 0;
        int input = 0;

        //Declare scanner
        Scanner keyboard = new Scanner(System.in);

        //While loop checking if user input does not equal 11
        while(input != 11){
            System.out.print("Please enter a non-negative value ");
            input = keyboard.nextInt();

            //If user input is less than zero, ask user to enter another number
            if (input < 0)
            {
                System.out.println("Please enter a positive value");
            }
            else
            {
                counter++;
            }
        }
        //Output the length of the sequence once the user enters 11
        counter--;
        System.out.println("Total length of sequence: " + counter);
    }
}
