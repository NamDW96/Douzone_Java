
public class Ex03_Array_For {
	public static void main(String[] args) {
		/*
		 ☆Today Point!☆
		 for >> 향상된 for문, 개선된 for문
		 JAVA : for(Type 변수명 : 배열 or collection) {실행블록}
		 C#   : for(Type 변수명 in 배열 or collection) {실행블록}
		 JavaScript : for(Type 변수명 in 배열 or collection) {실행블록}
		 
		 
		 
		 */
		int[] arr = {5,6,7,8,9};
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//개선된 for문
		for(int value : arr) {
			System.out.println(value);
		}
		
		String[] strarr = {"A","B","C","D","FFFFFF"};
		for (String value : strarr) {
			System.out.println(value); //초기값 배열의 길이를 알 필요가 없다.
		}
	}
}
