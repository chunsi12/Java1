package day0319.reference;

public class ArrayEx3 {

	public static void main(String[] args) {
		int a = 89;
		int b = 76;
		int c = 54;
		int d = 79;
		int e = 90;
		
		int sum = a + b + c + d + e;
		//배열: 많은 양의 데이터를 다루기에 훨씬 효율적이다.
		int[] score = {89, 76, 54, 79, 90};
		
		int sum2 = 0;
		for(int i = 0; i < score.length; i++) {
			sum2 += score[i];
		}

	}

}
