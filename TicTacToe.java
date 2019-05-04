//Lea Sleiman
//Game of TicTacToe using an array implementation 

public class TicTacToe {
	
	private String[] TicTacToeBoard;
	public int numCell=9;
	
	//Constructor
	public TicTacToe() {
		
		TicTacToeBoard= new String[numCell];
	}
	
	//method will check if the game has been won 
	public boolean CheckWin() {
		if (getCell(0).equals(getCell(1))&& getCell(0).equals(getCell(2))) return true;
		else if (getCell(3).equals(getCell(4))&& getCell(3).equals(getCell(5))) return true;
		else if (getCell(6).equals(getCell(7))&& getCell(6).equals(getCell(8))) return true;
		else if (getCell(0).equals(getCell(4))&& getCell(0).equals(getCell(8))) return true;
		else if (getCell(2).equals(getCell(4))&& getCell(2).equals(getCell(6))) return true;
		else if (getCell(0).equals(getCell(3))&& getCell(0).equals(getCell(6))) return true;
		else if (getCell(1).equals(getCell(4))&& getCell(1).equals(getCell(7))) return true;
		else if (getCell(2).equals(getCell(5))&& getCell(2).equals(getCell(8))) return true;
		
		else return false;
	}
	
	//Set method
	public void setCell(int pos, String choice) {
		TicTacToeBoard[pos]= choice;
	}
	
	//Will print the board in a nicer format than an array
	public void printBoard() {
		for (int outer=0;outer<numCell;outer++) {
			if (outer<3) {
				if (getCell(outer)!="X" && getCell(outer)!="O") System.out.print("-"+"|");
				else System.out.print(getCell(outer)+"|");
			}
			else if (outer==3) {
				if (getCell(outer)!="X" && getCell(outer)!="O") {
					System.out.println();
					System.out.println("-------");
					System.out.print("-"+"|");
					}
				else {
				System.out.println();
				System.out.println("-------");
				System.out.print(getCell(outer)+"|");
					}
			}
			else if (outer<6&&outer>3) {
				if (getCell(outer)!="X" && getCell(outer)!="O")  System.out.print("-"+"|");
				else System.out.print(getCell(outer)+"|");
			}
			else if (outer==6)  {
				if (getCell(outer)!="X" && getCell(outer)!="O") {
					System.out.println();
					System.out.println("-------");
					System.out.print("-"+"|");
					}
				else {
					System.out.println();
					System.out.println("-------");
					System.out.print(getCell(outer)+"|");
					}

			}
			else if(outer>6) {
				if (getCell(outer)!="X" && getCell(outer)!="O")  System.out.print("-"+"|");
				else System.out.print(getCell(outer)+"|");
					}
			}
		System.out.println();
	}
	
	//Get method
	public String getCell(int pos) {
		return TicTacToeBoard[pos];
	}
 }
	
