package day0321.oop.method;

public class PrimitiveParameter {
		
		static void change(int x) {//기본형 매개변수
			x = 1000;
			System.out.println("x : "+x);
		}
		public static void main(String[] args) {
			Data d = new Data();
			d.x = 10;
			
			change(d.x);
			System.out.println("d.x : "+d.x);//10 객체 안에 있는 값 변경 X
		}

	}


