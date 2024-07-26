package day0314.input;

import java.util.Scanner;

public class InputExDouble {

	public static void main(String[] args) {
		//원의 반지름을 입력받아서 원의 크기를 구하시오.(반지름 * 반지름 * 파이)
		final double PI = 3.14;
		//스캐너 생성
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 > ");
		double radius = scan.nextDouble();
		
		System.out.println("원의 크기 : "+ (radius*radius*PI));

	}

}
