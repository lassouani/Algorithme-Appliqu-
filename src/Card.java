import java.util.Random;


public class Card extends Cards{
	
	private int card_number;
	private int card_color;
	


	public Card(int card_number, int card_color) {
		
		this.card_number = card_number;
		this.card_color = card_color;
		
	}



	public Card generateCard(int number_of_colors) {
		
		//numero de carte 
		Random rand = new Random();
		int number = rand.nextInt(10);
		
		//numero de couleur 
		Random rand1 = new Random();
		int color = rand.nextInt(number_of_colors);
		
		return new Card(number,color);
	}
	public String toString() {
		return card_number+" "+ card_color +"\n";
	}
}
