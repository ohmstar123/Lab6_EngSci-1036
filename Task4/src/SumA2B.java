import java.util.Scanner;

public class SumA2B {
    public static void main(String[] args) {

        //declare scanner
        Scanner keyboard = new Scanner(System.in);

        //ask user to enter 2 values and declare variables
        System.out.println("Please enter two values");
        int inputA = keyboard.nextInt();
        int inputB = keyboard.nextInt();
        int total = 0;

        //Find the sum of all number between the two user inputed values
        for (int i = inputA; i <= inputB; i++) {
            total+=i;
        }
        //output the total of the sum
        System.out.println("The sum of all the values before your value is: " + total);

    }
}
