package day0318.whileex;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		//남은 좌석 : 5
		//기차표 구입 (Y/N)
		Scanner s = new Scanner(System.in);
		int seatsize = 5;
		
		while(true) {
			System.out.print("기차표 구입(Y/N)>");
			char yn = s.next().charAt(0);
			//입력값이 Y이거나 y이면 좌석 판매
			//N 혹은 n이면 구매 취소
			//그 외 나머지 경우라면 "잘못 입력" 출력
			if(yn == 'Y'|| yn == 'y') {
				System.out.println("좌석 판매");
				seatsize--;
			}else if(yn == 'N'||yn == 'n') {
				System.out.println("구매 취소");
			}else {
				System.out.println("잘못 입력");
			}
			if(seatsize ==0) {
				break;
			}
		}
		System.out.println("판매 완료");

	}

}
