public class ScoreKeeperTest{
	public static void main(String[] args){
		ScoreKeeper player = new ScoreKeeper();
		System.out.println("Intial score: " + player.getScore());
		player.scoreNormal();
		System.out.println("After normal score: " + player.getScore());
		player.scoreBonus();
		System.out.println("after bonus score: " + player.getScore());
		}
	}
