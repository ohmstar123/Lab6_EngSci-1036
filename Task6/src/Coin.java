public class Coin {

    //Declare private strings
    private String sideUp;

    //Declare constructor
    public Coin(){
        toss();
    }

    //Toss method to check whether the random number is either 1 or 0
    public void toss(){
        double rand = Math.random();

        if ((int)(rand + 0.5) == 1){
            sideUp = "Tails";
        }
        else{
            sideUp = "Heads";
        }

    }

    //String return statement which will return either Tails or Heads depending on the output of the toss method
    public String getSideUp(){
        return sideUp;
    }

}
