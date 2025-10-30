public class MagicEightBallTest{
    public static void main(String[] args){
        MagicEightBall ball = new MagicEightBall();

        System.out.println("Question: Will I pass my exam?");
        System.out.println("Answer: " + ball.ask("Will I pass my exam?"));
        System.out.println();

        System.out.println("Question: Should I get pizza?");
        System.out.println("Answer: " + ball.ask("Should I get pizza?"));
        
        System.out.println("Question: Should I get ice cream?");
        System.out.println("Answer: " + ball.ask("Should I get pizza?"));
    }
}
