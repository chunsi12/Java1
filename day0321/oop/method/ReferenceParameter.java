package day0321.oop.method;

public class ReferenceParameter {
	
	static void change(Data d) {//참조형 매개변수
		d.x = 1000;
		System.out.println("d.x : "+d.x);
	}
	static void change2(int[] x) {
		x[0] = 1000;
		System.out.println("x[0] : "+x[0]);
	}

	public static void main(String[] args) {
		int [] x = {10};
		change2 (x);
		System.out.println("x[0] : "+ x[0]);
		
		Data d = new Data();
		d.x = 10;
		
		change(d);//주소값 전달 
		System.out.println(d.x);//1000 객체 내 변수의 값 변경 가능
	}

}
