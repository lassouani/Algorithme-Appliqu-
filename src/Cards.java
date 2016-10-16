import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Cards {

	private Set<Card> hand = new HashSet<Card>();
	
	public Cards() {
		
	}
	
	public Set<Card> generateHand(int number_of_cards, int number_of_colors) {
		
		Card c =new Card(number_of_cards, number_of_colors);
		
		for(int i = 0 ; i< number_of_cards; i++) {
			hand.add(c.generateCard(number_of_colors));
		}
		
		return hand;
	}
	
	public String toString() {
		String result="";
		Iterator i=hand.iterator(); 
		while(i.hasNext()) 
		{
			result+= i.next().toString(); 
		}
		return result;
	}

}
