package day0314.input;

import java.util.Scanner;//ctrl + shift + o

public class InputExStr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요 > ");
		//화면에 키보드로 입력한 값 == String 타입
		String name = scan.next();// 공백, tab을 기준으로 잘라내어(touken) 한개씩 가져옴
		
		System.out.println("이름 : "+ name);
		System.out.println("이름과 성을 띄어서 입력하세요 >");
		scan.nextLine();
		String name2 = scan.nextLine();//공백을 포함한 한 줄을 입력받음
		System.out.println("이름2 : "+ name2);
		
	}

}
