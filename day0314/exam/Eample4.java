package day0314.exam;

import java.util.Scanner;

public class Eample4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("세자리 숫자 입력");
		int no = s.nextInt();
		
		System.out.println(no / 100*100);
		int h = no / 100; //백의 자리
		no = no % 100; 
		int t = no / 10;
		int o = no % 10; 
		System.out.printf("%d백 %d십 %d", h, t, o);
	}

}
