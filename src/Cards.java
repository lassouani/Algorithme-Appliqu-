package AAproject.src;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class Cards {

	//private Set<Card> hand = new HashSet<Card>();
	  public ArrayList<Card> hand = new ArrayList<Card>();
	  
	  public ArrayList<Card> sequence = new ArrayList<Card>();
		boolean find=true;
	
	public Cards() {
		
	}
	
	public ArrayList<Card> generateHand(int number_of_cards, int number_of_colors) {
		
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
	
	
	public Card FirstElement(){
		return hand.get(0);
	}
	
	
	public ArrayList<Card> Recherche(ArrayList<Card> hand, Card racine) {
		  if (!hand.isEmpty()) {
			
					Iterator i=hand.iterator(); 
					while(i.hasNext() & find==true) {
						
						//enlever la racine de l'ensemble et le metre dans sequnce
						//faire en sorte qu'il enleve qu'une instance
						if (i.equals(racine)) {
							Card x=(Card) i.next();
							sequence.add(x);
							i.remove();
							find=false;
						}
							}
					Iterator j=hand.iterator(); 
					while(j.hasNext()) 
					{
						Card x=(Card) j.next();
						
						if ((x.getCard_number()==racine.getCard_number() )|| (x.getCard_color()==racine.getCard_color())) {
							Recherche(hand, x);
							
						}
					}
				
				}else {
					
				}
				return sequence;
					
					
				}
	
	
	
	
	
}
	
	
	
	
	
	
	

	
	
	


