package AAproject.src;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Cards {

	// private Set<Card> hand = new HashSet<Card>();
	public ArrayList<Card> hand = new ArrayList<Card>();
	public ArrayList<Card> sequence = new ArrayList<Card>();
	boolean find = true;
	int counter = 0;

	public Cards() {}

	/*
	 * generate a set of cards
	 */
	public ArrayList<Card> generateHand(int number_of_cards,
			int number_of_colors) {

		Card c = new Card(number_of_cards, number_of_colors);
		for (int i = 0; i < number_of_cards; i++) {
			hand.add(c.generateCard(number_of_colors));
		}
		return hand;
	}
	

	// Recursive method ( Stops when hand is empty )
	public void play() {
		Card c = getHand(0);
		counter++;
		System.out.println("----------- STEP:" + counter + "-----------\n");
		System.out.println("The hand is :");
		printHand();
		System.out.println("The hand to play is :");
		ArrayList<Card> cardstoplay = new ArrayList<Card>();
		for (Card card : this.hand) {
			if (card.getCard_number() == c.getCard_number()
					|| card.getCard_color() == c.getCard_color())
				cardstoplay.add(card);
		}
		for (Card cc : cardstoplay) {
			cc.print();
			hand.remove(cc);
		}
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
		}
		if (hand.size() > 0)
			play();
		else
			System.out.println("------Done-----");

	}

	public void printHand() {
		for(Card card : hand)
			System.out.println(card.getCard_number()+"  "+card.getCard_color());
	}

	public Card getHand(int i) {
		// TODO Auto-generated method stub
		if (hand.size() == 0)
			return null;
		return hand.get(i);
	}

}
