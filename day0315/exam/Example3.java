package day0315.exam;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int a = s.nextInt();
		
		System.out.println("두번째 정수");
		int b = s.nextInt();
		
		if(a < b) {
			System.out.printf("%d - %d = %d", a, b, (a-b));
		}else {
			System.out.printf("%d - %d = %d", b, a, (b-a));
		}
 
	}

}
