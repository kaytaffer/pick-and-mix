import java.util.Scanner;
import java.util.Random;

public class BabbysFirstCardGame21 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		//int[] deck; //TODO how initialize vector?
		int player = nextCard()+nextCard(); 
		int dealer = nextCard();
		String notherCard = "y"; 
		int numberOfPlayers = 1; //TODO add more players
				System.out.println("WELCOME TO BABBY'S FIRST CARD GAME\n\nThe aim of this game is to beat the dealer, drawing cards valued 1-10"
				+ " at a time. The dealer draws after you\nBoth of you want to get as close to 21 as possible without going over. If "
				+ " you both have the same value when the draw ends, the dealer wins.");
		System.out.println();
		deckGeneration();
		/*deck generator
		for(int i=0; i < 52; i++)
		{
			deck[i] = i;
		}
		*/
		
		while(player < 21 && notherCard.equals("y")) 
		{

			System.out.println("The dealer shows " + dealer + ".");
			System.out.println("You have " + player);
			System.out.print("Do you want another card? y/n: ");
			notherCard = input.next();
			if (notherCard.equals("y"))
				player = player + nextCard();
			System.out.println();
			
		}
		
		if (player > 21)
			System.out.println("You landed on " + player + " and went bust!");
		else 
		{
			float playerAverage = player / numberOfPlayers; //if multiple players, take average
			while(dealer < playerAverage && dealer < 21) 
			{
				System.out.println("The dealer has " + dealer + ".");
				System.out.println("You have " + player);
				dealer = dealer + nextCard();
				System.out.println("The dealer draws another card and lands on " + dealer);
				if(dealer > 21)
					System.out.println("The dealer went bust!");
			}
			if (dealer >= player && dealer < 22)
				System.out.println("The dealer wins!");
			else
			{
				System.out.println("\nYou win!");
			}
			
		}
		System.out.println("\n\n GAME OVER!\n\n");
		input.close();
	}
	
	public static int nextCard() 
	{
		Random random = new Random();
		int card = random.nextInt(13)+1;
		switch(card)
		{
		case 13: card = 10;
		break;
		case 12: card = 10;
		break;
		case 11: card = 10;
		break;
		default: break;
		}
		return card;
	}

	public static int[][] deckGeneration()
	{
		int[][] deck = {
						{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
						{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
						{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
						{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
						}; 
		return deck;
	}
	/* TODO added functionality 
	Ett ess �r fortfarande bara 1, inte 14 eller 1.
	Och man kan dra t.ex. fem femmor i en omgång. 
	Och man kan inte satsa några pengar. 
	Och man kan inte splitta eller dubbla. 
	Och det finns bara en spelare.
	*/

}
