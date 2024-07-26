package day0318.exam;

public class Exercise3 {

	public static void main(String[] args) {
		// int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 작성하세요
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num %10; //0+5+4+3+2
			num /=10; //1234 -> 123 -> 12 ->1
		}
		
		System.out.println("sum :"+sum);
		System.out.println(num);

	}

}
