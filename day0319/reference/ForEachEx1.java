package day0319.reference;

public class ForEachEx1 {
//향상된 for문 : 배열의 전체 데이터에서 하나씩 꺼내와서 처리한다
//for (변수 선언 : 배열) {반복할 수행문;}
	public static void main(String[] args) {
		int[] num = {1,5,3,6,7,2,4};
		
		for(int i : num) {
			System.out.println(i);
		}
		String [] sarr = {"AA","b","CC","DD"};
		//sarr에 저장된 모든 문자열들 출력하는 foreach문
		for(String s : sarr) {
			System.out.println(s);
		}
		char[] ch = {'A','B','c'};
		//ch에 저장된 모든 문자들 출력하는 foreach문
		for(char c : ch) {System.out.println(c);}
		

	}

}
