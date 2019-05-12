//This is a guessing game. The cpu will generate random number between 0 and 9
// Three players can play it.
//They each have to guess the correct number.
//The one guessing correctly wins.

public class guessGame{
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;

		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;

		int tgtno = (int)(Math.random()*10);
		System.out.println("Think of a no. between 0 and 9...");

		while(true){
			System.out.println("No. to guess is "+tgtno);

			p1.guess();
			p2.guess();
			p3.guess();

			guess1 = p1.number;
			System.out.println("Player one guessed "+guess1);

			guess2 = p2.number;
			System.out.println("Player one guessed "+guess2);

			guess3 = p3.number;
			System.out.println("Player one guessed "+guess3);

			if(guess1==tgtno){
				p1Right=true;
			}
			if(guess2==tgtno){
				p2Right=true;
			}
			if(guess3==tgtno){
				p3Right=true;
			}

			if (p1Right || p2Right || p3Right){
				System.out.println("We have a winner!");
				System.out.println("player one got it right? "+p1Right);
				System.out.println("player two got it right? "+p2Right);
				System.out.println("player three got it right? "+p3Right);
				System.out.println("Game is Over.");
				break;
			} else{
				System.out.println("Players, try again!");
			}
		}
	}
}

