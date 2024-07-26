package day0315.exam;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int a = s.nextInt();
		System.out.print("두번째 정수 : ");
		int b = s.nextInt();
		System.out.print("세번째 정수 : ");
		int c = s.nextInt();
		//평균
		double avg = (a + b + c) / 3.0;
		//최대값
		int max = a;
		
		if(max < b) {max = b;}
		if(max < c) {max = c;}
		
		//최소값
		int min = a;
		if(min > b) {min = b;}
		if(min > c) {min = c;}
		
		System.out.printf("평균 : %.2f, 최대 : %d, 최소 : %d", avg, max, min);

	}

}
