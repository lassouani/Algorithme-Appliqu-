package AAproject.src;


import java.util.Random;


public class Card extends Cards{
	
	private int card_number;
	private int card_color;
	


	public Card(int card_number, int card_color) {
		
		this.setCard_number(card_number);
		this.setCard_color(card_color);
		
		
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
		return getCard_number()+" "+ card_color +"\n";
	}



	public int getCard_number() {
		return card_number;
	}

	public int getCard_color() {
		return card_color;
	}
	
	public int setCard_number(int card_number) {
		return this.card_number=card_number;
	}
	public int setCard_color(int card_color) {
		return this.card_color=card_color;
	}
	
	
	
	
	
	
	
	

	
}
