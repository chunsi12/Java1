package day0313.variable;

public class VarTypeEx3 {
	
	public static void main(String [] args) {
		//실수 : float / double
		//실수 리터럴의 타입은 double 
		double d = 3.14;
		
//		float f = 3.14; //Type mismatch: cannot convert from double to float
		float f= 3.14F; // 실수 리터럴F -> float 타입이 된다. 
		
		double d2 = 0.1234567890123456789;
		float f2 = 0.1234567890123456789F;
		
		System.out.println("d2 :" + d2);
		System.out.println("f2 :" + f2);
		
		//상태가 2가지만 있는 경우 사용한다. 
		boolean stop = true; //true : 중지, false : 동작
		
		if(stop) {
			System.out.println("중지상태입니다.");
		}else {
			System.out.println("동작 중 입니다.");
		}
		
	}

}
