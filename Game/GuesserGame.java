package Game;

import java.util.Scanner;

class Guesser{
	int guessNum;
	
	int guessnum() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum =scan.nextInt();
		return guessNum;
		
	}
}

class Player{
	int guessNum;
	
	int guessNum(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum =scan.nextInt();
		return guessNum;	
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
   void collectNumFromGuesser()
   {
	 Guesser g= new Guesser();
	 numFromGuesser=g.guessnum();
   }
   
   void collectNumFromPlayers()
   {
	Player p1 = new Player();  
	Player p2 = new Player();  
	Player p3 = new Player(); 
	numFromPlayer1= p1.guessNum();
	numFromPlayer2= p1.guessNum();
	numFromPlayer3= p1.guessNum();
   }
   
   void compare()
   {
	 if(numFromGuesser == numFromPlayer1) {
		 if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
			 System.out.println("All player won the game");
	    }
		 else if(numFromGuesser == numFromPlayer2 ) {
			 System.out.println("Player 1 and 2 won the game");
	    }
		 else if(numFromGuesser == numFromPlayer3 ) {
			 System.out.println("Player 1 and 3 won the game");
	    }
		 else {
		 System.out.println("Player 1 won the game");
	 }
	 }
	 
	 else if(numFromGuesser == numFromPlayer2) {
		 if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
			 System.out.println("All player won the game");
	    }
		 else if(numFromGuesser == numFromPlayer1 ) {
			 System.out.println("Player 1 and 2 won the game");
	    }
		 else if(numFromGuesser == numFromPlayer3 ) {
			 System.out.println("Player 2 and 3 won the game");
	    }
		 else {
		 System.out.println("Player 2 won the game");
	 }
	 }
	 else if(numFromGuesser == numFromPlayer3) {
		 if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
			 System.out.println("All player won the game");
	    }
		 else if(numFromGuesser == numFromPlayer1 ) {
			 System.out.println("Player 1 and 3 won the game");
	    }
		 else if(numFromGuesser == numFromPlayer2 ) {
			 System.out.println("Player 2 and 3 won the game");
	    }
		 else {
		 System.out.println("Player 3 won the game");
	 }
	 }
	 else {
		 System.out.println("Game Lost Try Again");
	 
	 }
   }
}




public class GuesserGame {

	public static void main(String[] args) {
	Umpire u= new Umpire();
	u.collectNumFromGuesser();
	u.collectNumFromPlayers();
	u.compare();
	}
}
