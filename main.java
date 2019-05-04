import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TicTacToe gameBoard = new TicTacToe();
		
		//Will set every cell in the array to a different value (so that the program won't confuse it with a winning game situation)
		//In terms of runtime this isn't to bad because although it ends up being O(n), n won't we greater than 9
		for (int i=0; i<gameBoard.numCell; i++) {
			gameBoard.setCell(i, Integer.toString(i));
		}
		
		int d=1;
		System.out.println("Board Initiated:");
		gameBoard.printBoard(); 
		System.out.println();
		
		//Will start the game
		while(!gameBoard.CheckWin() || d==9) {
			d++;
			if (d%2==0) {
			System.out.println("Player X enter position[0->8]: ");
			int userXpos= Integer.parseInt(input.next());
			if (gameBoard.getCell(userXpos).equals("X") || gameBoard.getCell(userXpos).equals("O")) System.out.println("lost turn, spot taken");
			else gameBoard.setCell(userXpos, "X");
			}	
			else if (d%2 ==1) {
			System.out.println("Player O enter position[0->8]: ");
			int userOpos= Integer.parseInt(input.next());
			if (gameBoard.getCell(userOpos).equals("X") || gameBoard.getCell(userOpos).equals("O")) System.out.println("lost turn, spot taken");
			else gameBoard.setCell(userOpos, "O");
			} 
			
			gameBoard.printBoard();
		} 
		System.out.println();
		System.out.println("Game Over");
		if(d==9)System.out.println("no winners");
		else if (d%2==0) System.out.println("player X won");
		else System.out.println("player O won");
	}
}
