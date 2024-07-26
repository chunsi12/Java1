package day0319.reference;

public class EmptyArrayEx {

	public static void main(String[] args) {
		
		char [] arr = {};//EmptyArray
		System.out.println(arr.length);
		System.out.println(arr);//""
		char[] arr2 = {0};//크기가 1인
		
		System.out.println(arr2.length);
		for(char c : arr2) {
			System.out.println(c);
		}

	}

}
