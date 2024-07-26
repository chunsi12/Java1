package day0318.whileex;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		//숫자 맞추기 게임
		//정답을 random으로 만들고 입력값과 비교해 맞출때까지 입력받는다.
		//(int)(Math.random() * 숫자 범위) + 시작값;
		int answer = (int)(Math.random()*10)+1;
				//(0.0~1.0) * 10 (int)(0.0 ~ 10.0) (0~9)+1 => 1~10
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("1~10사이의 숫자를 맞춰보세요 >");
			int input = s.nextInt();
			if(input == answer) {
				System.out.println("정답");
				break;
			}else if(input > answer) {
				System.out.println("DOWN");
			}else {
				System.out.println("UP");
			}
			}
		System.out.println("END");
	}

}
