package day0315.ifex;

public class IfEx1 {
	public static void main(String[] args) {
		
		int no = 100;
		//if(조건식) {조건식이 true 일 때만 수행할 문장}
		//if(조건식) {조건식이 true 일 때만 수행할 문장}else{false 일 때 수행할 문장}
		//{}안에 수행할 문장이 1줄이라면 {}을 생략할 수 있다.
		if(no>=50) {
			System.out.println("50이상입니다.");
			
		}else 
			System.out.println("50미만입니다.");//{}이 없다면 여기까지 else영역
		//if end
		    System.out.println("else블럭안에 들어가 있을까요?");//조건식과 관계없는 문장
		
		
		System.out.println("프로그램 종료!!");

	}

}
