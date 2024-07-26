package day0315.exam;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("년도 입력>");
		int year = s.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
			System.out.println(year +" : 윤년");
		}else {
			System.out.println(year +" : 평년");
		}
		

	}

}
