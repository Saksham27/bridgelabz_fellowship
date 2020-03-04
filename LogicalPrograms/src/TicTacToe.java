import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

	public static boolean userMove(char[][] b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the position for your move : ");
		System.out.println("*********** Your Move *****************");
		int c = sc.nextInt();
		return updateBoard(b,c,'X');
	}
	
	public static boolean cpuMove(char[][] b) {
		Random r = new Random();
		System.out.println("*********** CPU Move *****************");
		int x = r.nextInt(9)+1;
		
		return updateBoard(b,x,'O');
	}
	
	public static boolean checkWin(char[][] b) {
		char[] c= {'a','a','a'};
		if(b[0][0]==b[0][1] && b[0][0]==b[0][2]) {
			c[0]= b[0][0] ;
			c[1] = b[0][1];
			c[2] = b[0][2];
		}
		if(b[1][0]==b[1][1] && b[1][0]==b[1][2]) {
			c[0]= b[1][0] ;
			c[1] = b[1][1];
			c[2] = b[1][2];
		}
		if(b[2][0]==b[2][1] && b[2][0]==b[2][2]) {
			c[0]= b[2][0] ;
			c[1] = b[2][1];
			c[2] = b[2][2];
		}
		if(b[0][0]==b[1][0] && b[0][0]==b[2][0]) {
			c[0]= b[0][0] ;
			c[1] = b[1][0];
			c[2] = b[2][0];
		}
		if(b[0][1]==b[1][1] && b[0][1]==b[2][1]) {
			c[0] = b[0][1] ;
			c[1] = b[1][1];
			c[2] = b[2][1];
		}
		if(b[0][2]==b[1][2] && b[0][2]==b[2][2]) {
			c[0] = b[0][2] ;
			c[1] = b[1][2];
			c[2] = b[2][2];
		}
		if(b[0][0]==b[1][1] && b[0][0]==b[2][2]) {
			c[0] = b[0][0] ;
			c[1] = b[1][1];
			c[2] = b[2][2];
		}
		if(b[2][0]==b[1][1] && b[2][0]==b[0][2]) {
			c[0] = b[2][0] ;
			c[1] = b[1][1];
			c[2] = b[0][2];
		}
		if(c[0]=='a') {
			return false;
		}else {
			showBoard(b);
			if(c[0]=='X') {
				
				System.out.println("\n_______ Wohoooo !!! You won. _______");
			}
			if(c[0]=='O') {
				
				System.out.println("\n_______ Better luck next time !!! CPU won. _______");
			}
			return true;
		}
	}
	
	public static boolean updateBoard(char[][] b,int x,char c) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(x==(int)b[i][j]) {
					b[i][j]=c;
					return true;
				}	
			}
		}
			System.out.println("Enter valid posiiton please !!!");
			return false;
	}
	
	public static void showBoard(char[][] b) {
		for(int i=0;i<3;i++) {
			System.out.print("| ");
			for(int j=0;j<3;j++) {
				if(b[i][j]=='X' || b[i][j]=='O') {
					System.out.print(b[i][j]+" | ");
				}else {
					System.out.print((int)b[i][j]+" | ");
				}
			}
			
			System.out.println("\n|---|---|---|");
		}
	}
	
	public static void game(char[][] b) {
		int i=9;
		while(i>=1) {
			showBoard(b);
			if(i%2!=0) {
				if(userMove(b)) {
					i--;
				}
			}else {
				if(cpuMove(b)) {
					i--;
				}
			}
			if(checkWin(b)) {
				break;
			}else if(i==0) {
				System.out.println("Game draw !!!");
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		char[][] board = new char[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
//		System.out.println(" ********* POSITIONS ***********");
//		System.out.print("| 1 | 2 | 3 |\n"
//					   + "|---|---|---|\n"
//					   + "| 4 | 5 | 6 |\n"
//					   + "|---|---|---|\n"
//				       + "| 7 | 8 | 9 |\n");
		System.out.println(" ********* Your Board ***********");
		
		
		game(board);
		
		

	}

}
