import java.util.Random;
import java.util.Scanner;
/*
 * Name: Harshil Shah
 * Assignment: program2
 * Semester: Fall 2021 
 * USC-Sumter
 * CSCE 145
 * 09/23/2021
 */

public class Program2ShahHarshil {

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in);
		int row = 0;
		int column = 0;
		Random myRand = new Random();
		int userInput = 0;
		
		boolean playAgain = true;
		
		while(playAgain) {
			
		// create a double array named board
			char[][] board = new char [3][3];	
	
			// Fill the board with empty space	
			for(int i=0;i<board.length;i++) {
				for(int j=0;j<board[i].length;j++) {
				board[i][j]= ' ';
				}
			}
			//draw the board
			
			System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
			System.out.println("-+-+-");
			System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
			System.out.println("-+-+-");
			System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
			
			//keep count of whose turn it is 
		 	int turn = 0;
		 	
		 	//Repeat steps 2 - 5
			 boolean gameOver = false; 
			 while(!gameOver){
				 
				boolean validMove = false;
				while(!validMove) {// repeat if move is valid 
					
					//Get the input from user
					System.out.println("Enter a row number (0, 1, or 2)");
					row = kb.nextInt();
					System.out.println("Enter a column number (0, 1, or 2) ");
					column = kb.nextInt();
				
					//Check if the move is legal or not 
					if (row < 0 || column < 0 || row > 2 || column > 2 ) {
						System.out.println("your move is out of bounds");
					}else if (board[row][column] != ' ') {
						System.out.println("The spot has been taken");
					}else
						validMove = true;
				}
					board[row][column]= 'x';
					turn++;
					
				//check if player won. Think about all the option in which player can win. 
				if
					((board [0][0]==  'x' && board [0][1]=='x'&& board [0][2]=='x') ||
						(board [1][0]== 'x' && board [1][1]=='x'&& board [1][2]=='x') ||
						(board [2][0]== 'x' && board [2][1]=='x'&& board [2][2]=='x') ||
						
						(board [0][0]== 'x' && board [1][0]=='x'&& board [2][0]=='x') ||
						(board [0][1]== 'x' && board [1][1]=='x'&& board [2][1]=='x') ||
						(board [0][2]== 'x' && board [1][2]=='x'&& board [2][2]=='x') ||
						
						(board [0][0]== 'x' && board [1][1]=='x'&& board [2][2]=='x') ||
						(board [0][2]== 'x' && board [1][1]=='x'&& board [2][0]=='x')) 	
				{
					System.out.println("Player won");
					gameOver = true;
				}//check if their is a tie or not
				else if (turn == 9) {
					System.out.println("Tie");
					gameOver = true;// change it true back
				}
				
				//run everything below this line if the player did not win and it wasn't a tie
				else{
					validMove = false;
				
				//computer move
				while(!validMove){
					row = myRand.nextInt(3);
					column = myRand.nextInt(3);
					if(board[row][column] == ' '){
					validMove = true;
					}
				}//end of computer while loop
				board[row][column]= 'O';
				turn++;
				
				//check if computer won 
				if((board [0][0]== 'O' && board [0][1]=='O'&& board [0][2]=='O') ||
					(board [1][0]== 'O' && board [1][1]=='O'&& board [1][2]=='O') ||
					(board [2][0]== 'O' && board [2][1]=='O'&& board [2][2]=='O') ||
						
					(board [0][0]== 'O' && board [1][0]=='O'&& board [2][0]=='O') ||
					(board [0][1]== 'O' && board [1][1]=='O'&& board [2][1]=='O') ||
					(board [0][2]== 'O' && board [1][2]=='O'&& board [2][2]=='O') ||
						
					(board [0][0]== 'O' && board [1][1]=='O'&& board [2][2]=='O') ||
					(board [0][2]== 'O' && board [1][1]=='O'&& board [2][0]=='O')) 
				{
					System.out.println("Computer won");
					gameOver = true;
				}
			
				}//else ending
			
				System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
				System.out.println("-+-+-");
				System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
				System.out.println("-+-+-");
				System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
				
			 }//Gameover loop ending 
			
			 //Asking user if they want to play again 
			 System.out.println("Would you like to play again?");
			 System.out.println("Enter 1 to play again or enter 2 to close the game.");
			 userInput = kb.nextInt();
			 
			 if(userInput == 2) {
				 playAgain = false;
			 }
			 
			 
		}//end of play again loop
		 
		System.out.println("Thanks for playing! ");
		kb.close();
		
	}//main class

} //class
