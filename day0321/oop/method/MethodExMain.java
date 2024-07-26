package day0321.oop.method;

public class MethodExMain {

	public static void main(String[] args) {
		MethodEx me = new MethodEx();
		
		long l = me.add(10,20);
		System.out.println("me.add(10,20) : "+1);
		
		System.out.println("me.multyply(2,5) :" + me);
		int i = me.divide(5, 3);
		System.out.println("5/3 = "+i);
		
		me.addString("Hello", "JAVA");

	}

}
