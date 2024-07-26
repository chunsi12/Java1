package day0318.exam;

public class Exercise4 {

	public static void main(String[] args) {
		//방정식 2X+4y=10 모든해를 구하시오
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(2*x + 4*y == 10) {
					System.out.printf("x : %d, y : %d\n", x,y);
				}
			}
		}

	}

}
