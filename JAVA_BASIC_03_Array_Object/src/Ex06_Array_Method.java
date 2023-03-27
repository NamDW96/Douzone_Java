class Human {
	String name;
	
}

class OverClass{
	int add(int i , int j) {
		return i + j;
	}
	
	void add(Human human) { //Human 타입의 주소값을 받는다. add(new Human())
		System.out.println(human.name);
	}
	//1. add(new Human())
	//2. Human h = new Human(); add(h);
	//반드시 해야 한다 ^6^
	
	//배열은 객체다 == 배열도 타입이다. 
	int add(int param) {
		return param +100;
	}
	
	int[] add(int[] params) { // add(String ... values) >> add(1,2,3) , add(1,2) >> 가변길이 매개변수
		//int[] arrr = {1,2} add(arr) // 배열타입의 주소값
		int[] target = new int[params.length];
		for (int i=0; i<target.length; i++) {
			target[i] = params[i]+1; 
		}
		return target; //주소값 (heap 있는 target 배열의 주소)
		//return null; // return을 정의하고 코딩 (객체 ,배열 null)
	}
//	int[] call(int[]a , int[]b, int[]c) {
//		return null;
//	}
}	


public class Ex06_Array_Method {
	public static void main(String[] args) {
		OverClass overt = new OverClass();
		int[] source = {10,20,30,40,50};
		int[] ta = overt.add(source);
		for(int value : ta) {
			System.out.println(value);
		}
	}
	

}


