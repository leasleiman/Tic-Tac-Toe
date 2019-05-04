
public class TicTacToe {
	
	private String[] TicTacToeBoard;
	public int numCell=9;
	
	public TicTacToe() {
		
		TicTacToeBoard= new String[numCell];
	}
	
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
	
	public void setCell(int pos, String choice) {
		TicTacToeBoard[pos]= choice;
	}
	
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
	
	public String getCell(int pos) {
		return TicTacToeBoard[pos];
	}
 }
	
