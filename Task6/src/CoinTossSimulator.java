import java.sql.SQLOutput;

public class CoinTossSimulator {
    public static void main(String[] args) {
        //Declaring Coin method
        Coin coinToss = new Coin();

        //Declaring variables
        int totalHeads = 0;
        int totalTails = 0;

        //Print the initial side of the coin and print that the coin will be tossed 10 times
        System.out.println("The side initally facing up: " + coinToss.getSideUp());
        System.out.println("Now I will toss the coin 10 times");

        //For loop to toss the coin 10 times and print whether it was heads or tails each toss
        for (int i = 0; i < 10; i++)
        {
            coinToss.toss();

            System.out.println("Toss:   " + coinToss.getSideUp());

            if (coinToss.getSideUp() == "Heads")
            {
                totalHeads++;
            }
            else
            {
                totalTails++;
            }
        }

        //Output the total head and the total tails
        System.out.println("Total Heads: " + totalHeads);
        System.out.println("Total Tails: " + totalTails);


    }
}
