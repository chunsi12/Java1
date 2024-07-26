package day0321.oop.variable;

public class Card {
	
	static int width;
	static int height;
	String kind;
	int num;
	
	Card(){}
	Card(String k, int n) {
	//객체에 생성된 인스턴스 변수에 값을 저장.
		kind = k;
		num = n;
	}
	
	void printcard() {
		System.out.printf("카드의 크기 : %d, %d \n 종류 : %s, %d \n"
				, width, height, kind, num);
	}

}
