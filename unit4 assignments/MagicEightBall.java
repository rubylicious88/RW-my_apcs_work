import java.util.Random;

public class MagicEightBall{
    private final String reply1 = "Yes, definitely!";
    private final String reply2 = "No, not a chance.";
    private final String reply3 = "Maybe someday.";

    public String ask(String question){
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;

        if (randomNumber == 1)
            return reply1;
        else if (randomNumber == 2)
            return reply2;
        else
            return reply3;
    }
}
