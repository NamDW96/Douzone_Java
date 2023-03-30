import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2{
	int x = 300;	//c# 부모 무시하기 (쓰지 마세요)
	
	//재정의 
	@Override
	void print() {
		System.out.println("자식이 부모의 함수를 재정의");
	}
	void print(String str) { //overloading
		System.out.println("나오 버로딩이 야 "+str);
	}
}

public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		t3.print();
		t3.print("overloading");
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp);
		//kr.or.kosa.Emp@1c4af82c
		//kr.or.kosa.Emp + "@" + 1c4af82c 조합된 값
		System.out.println(emp.toString()); //kr.or.kosa.Emp@1c4af82c
		//두개가 같은 값 >> emp(to String())이 생략됨.
		//Emp에서 toString 재정의함.
		
		
		/*
		 class Objcet {
		 	public String toString(){
		 		return 패키지명 + "@" + 주소값(hash코드값?)
		 	}
		 }
		 
		 class Emp extends Object{
		  
		 }
		 */
	}
}
