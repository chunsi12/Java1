package day0314.operator;

public class DivisionEx {

	public static void main(String[] args) {
		//어떤 숫자건 0, 0.0으로 나누면 안됨!!
		int no = 100;
		
		System.out.println(no / 0.0);//Infinity
		System.out.println(no % 0.0);//NaN (Not a number)

	}

}