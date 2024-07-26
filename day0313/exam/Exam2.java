package day0313.exam;

public class Exam2 {

	public static void main(String[] args) {
		// = : 오른쪽을 값을 왼쪽 변수에 대입(저장)한다. <-
		int x = 3;
		int y = 5;
		int z = 10;
		
		int temp = z;// x가 가지고 있는 데이터를 임시로 저장
		z = y;
		y = x;
		x = temp;
		
		System.out.printf("x : %d, y : %d, z : %d", x, y, z);

	}

}
