package day0315.ifex;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 > ");
		int age = sc.nextInt();
		int charge = 1400;
		if (age >= 0) {
		if(0<=age && age <=13 ) {
			charge = 500;
		} else if(14<=age && age <=20) {
			charge = 800;
		}else if (age >= 65) {
			charge = 0;
		}
         System.out.println("요금은 "+charge +"원 입니다."); 
	}

	}
}