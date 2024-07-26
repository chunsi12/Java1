package day0318.whileex;

import java.util.Scanner;

public class whileEx4 {
//bank - 1.예금 2. 출금 3. 잔액조회 4. 종료
	public static void main(String[] args) {
	
		int balance = 0;//잔액
		Scanner s = new Scanner(System.in);
		
		boolean run = true;//true : 반복(서비스 운영중), false : 중지 (서비스 종료)
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1.예금 2.출금 3.잔액조회 4.종료");
			System.out.println("----------------");
			System.out.print("선택 > ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				System.out.println("예금을 시작합니다.");
				System.out.print("예금액 >");
				int money = s.nextInt();
				balance += money;
				System.out.println("예금 완료");
			}else if (menu == 2) {
				System.out.println("출금을 시작합니다.");
				System.out.print("출금액 >");
				int money = s.nextInt();
				if(balance - money < 0) {
					System.err.println("잔액부족");
					System.out.println("출금을 할 수 없습니다");
				}else {
					balance -= money;
					System.out.println("출금이 완료되었습니다.");
				}
			}else if (menu == 3) {
				System.out.println("잔액을 조회합니다");
				System.out.println("잔액 :"+balance);
			}else if (menu == 4) {
				run = false;
				System.out.println("서비스 종료되었습니다.");
			}else {
				//하는 일 없이 while 반복
			}//if end
		}//while end
		

	}

}
