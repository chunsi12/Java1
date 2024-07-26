package day0321.oop.variable;

public class CardMain {

	public static void main(String[] args) {
		// w : 100, h : 250, k : "HEART" n:7
		// w : 100, h : 250, k : "CLOVER" n: 10
		
		Card.width = 100;
		Card.height = 250;
		
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.num = 7;
		
		c1.printcard();
		
		Card c2= new Card();
		c2.kind = "CLOVER";
		c2.num = 10;
		
		c2.printcard();
		
		System.out.println("c1.w:300, c1.h:500 after");
		c1.width= 300;
		c1.height = 500;
		
		c1.printcard();
		c2.printcard();
	}

}
