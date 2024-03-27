import java.util.Scanner;

public class Methods {
	public static String whoWon(String userMove, String botMove) {
		String winner = "";
		
		boolean userPicksRock = userMove.equals("Rock") && botMove.equals("Scissor") || userMove.equals("rock") && botMove.equals("Scissor");
		
		boolean userPicksScissor = userMove.equals("Scissor") && botMove.equals("Paper") || userMove.equals("scissor") && botMove.equals("Paper");
		
		boolean userPicksPaper = userMove.equals("Paper") && botMove.equals("Rock") || userMove.equals("paper") && botMove.equals("Rock");
		
		if (userPicksRock || userPicksScissor || userPicksPaper) {
			winner = "Player is the winner!";
		}  else if (userMove.equals(botMove) || userMove.equals(botMove.toLowerCase())) {
			winner = "Draw";
		} else {
			winner = "Opponent is the winner!";
		}
		
		return winner;
	}
	
	public static String playAgain() {
		Scanner toInput = new Scanner(System.in);
		String input = toInput.nextLine();
		
		return input;
	}
	
	public static String userMove() {
		Scanner toInput = new Scanner(System.in);
		String input = toInput.nextLine();
		
		return input;
	}
	
	public static String botMove() {
		String[] choices = {"Rock", "Paper", "Scissor"};
		double randomNumber = Math.random() * 3;
		int choicesLength = choices.length;
		int toInt = (int) randomNumber;
		String botChoice = "";
		
		for (int i = 0; i < choicesLength; i++) {
			if (toInt == i) {
				botChoice = choices[i];
				break;
			}
		}
		
		return botChoice;
	}
}