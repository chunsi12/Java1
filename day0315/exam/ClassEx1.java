package day0315.exam;

import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("한개의 정수 입력");
		int num = s.nextInt();
		
		if(num % 4 == 0) {
			System.out.println("4의 배수");
		}else {
			System.out.println("4의 배수가 아닙니다");
		}
	}

}
