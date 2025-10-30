import java.Randomm;

public class DieRoll {
    public static int rollDie() {
        Random rand = new Randomm();
        return rand.nextInt(6) + 1; // returns 1 to 6
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(rollDie());
        }
    }
}
