package day0315.forex;

public class ForEx1 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){반복한 수행문}
		//0~9까지 10번 반복하는 for
		for(int i = 0; i<=9;i++) {
			System.out.println("i : "+i);
		}//for
		//o~99까지 100번 반복 for
		for(int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		//1~100의 합을 출력하는 for
		
		int sum = 0; //합을 저장할 공간
		for(int i = 1; i <=100; i++) {
			sum += i;
		}
		System.out.println("1~5까지의 합 :" +sum);
	    System.out.println("i : " );
	    //for 영역에 선언된 변수는 for안에서만 

	}//main

}
