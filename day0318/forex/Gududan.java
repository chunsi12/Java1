package day0318.forex;

import java.util.Scanner;

public class Gududan {

	public static void main(String[] args) {
		//원하는 구구단의 단수를 입력받으면 해당 단을 출력한다.
		// 5을 입력하면 5단 출력
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 > ");
		int dan = s.nextInt();
		System.out.println(dan+"단\n----------------");
		
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		}
		for(int i =9;i>=1; i--){
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		}
		//*다중 for문
		//for(초기식1;조건식1;증감식1;){수행문1}
		//for(초기식2;조건식2;증감식2;){수행문2}//inner for 수행문 3 //outer for
		}
			

	}
