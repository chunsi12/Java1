package day0321.oop.method;

public class MethodEx {
	//int, long 타입의 두개의 값을 받엇 더한 결과를 리턴하는 add 메서드 선언
	long add(int i, long l) {
		return i + l;
	}
	//int, int 받아서 곱하고 결과를 리턴하는 multuply
	double multiply(int i, int j) {
		return i * j;
	}
	//double, double 받아서 나누고 결과 리턴하는 divide
	int divide(double d, double e) {
		return (int) (d / e);
	}
	//두개 문자열 받아서 더하고 출력 후 리턴하지 않는 addString
void addString(String s1, String s2) {
		System.out.println(s1 + s2);
		if(s1.equals("EXIT")) {
			return;
		}
	}
	

}
