package day0318.whileex;

import java.util.Scanner;

public class WhileEx2 {
	//while : 반복 횟수가 정해지지 않았을 경우 사용
	public static void main(String[] args) {
		//남은 좌석 : 5
		//기차표 구입 : (Y/N)
		Scanner s = new Scanner(System.in);
		int seatsize = 5; 
		
		while(seatsize != 0) {
			System.out.print("기차표 구입(Y/N) > ");
			char yn = s.next().charAt(0);
			//s.next() : 입력한 문자열 string 가져와서 
			//String==char 모여있는 
			//charAt(0) 문자열에서 제일 첫번째 글자만 가져온다 (char)
			if(yn=='Y') {
				System.out.println("좌석을 구입하였습니다.");
				seatsize--;
			}else {
				System.out.println("구입을 취소하였습니다.");
			}//if
			
		}//while 
		System.out.println("판매완료");
	
	}

}
