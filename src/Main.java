package AAproject.src;

import java.util.ArrayList;
import java.util.Iterator;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Card> sol = new ArrayList<Card>();
		Cards h = new Cards();
		h.generateHand(10, 3);
		System.out.println(h.toString());
		
		sol=h.Recherche(h.hand, h.FirstElement());	
		
		System.out.println("la solution est premiere carte"+sol.toString());
		
		
		
		
		
		

	}

}
