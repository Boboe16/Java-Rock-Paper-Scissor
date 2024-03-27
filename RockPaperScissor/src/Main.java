public class Main {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Rock, paper, or scissor?");
			
			String userMove = Methods.userMove();
			String botMove = Methods.botMove();
			
			System.out.println("You picked " +userMove);
			System.out.println("Opponent picked " + botMove);
			
			String whoWon = Methods.whoWon(userMove, botMove);
			System.out.println(whoWon);
			
			System.out.println("Wanna play again? Y/n");
			String playAgain = Methods.playAgain();
			if (playAgain.equals("y") || playAgain.equals("Y")) {
				continue;
			} else {
				break;
			}
		}
	}

}
