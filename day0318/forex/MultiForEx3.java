package day0318.forex;

//*
//**
//***
//****
//*****
public class MultiForEx3 {

	public static void main(String[] args) {
		for(int i = 0; i <5; i++) {
			for(int j = 0;j <=i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		System.out.println("-----------------");
		
		for(int a=5; a>0;a--) {
			for(int r =0; r<a; r++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	
	for(int i = 0; i<5; i++) {
		for(int j = 4; j> i; j--) {
			System.out.print(" ");
		}
		for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

}
