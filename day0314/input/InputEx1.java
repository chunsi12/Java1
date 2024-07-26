package day0314.input;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		// 새로운 스캐너 생성 - console화면으로 부터 데이터를 받아온다.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해보세요 > ");
		//값 입력 후 엔터키 누를때까지 기다렸다가 엔터가 입력되면 값을 읽어와 (String) int로 변경한다.
		int decimal = scan.nextInt();//숫자만 입력해야 한다.
		System.out.println("입력한 값 : "+decimal);

	}

}
