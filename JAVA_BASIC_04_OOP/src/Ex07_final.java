/*
 변수<>상수 
 상수 : 한번 값이 [초기화]되면 변경 불가
 상사자원 : 고유값 >> 주민번호, 수학 PI=3.141592...,시스템번호 (버전번호 v1.0 , v1.0.0)
 상수 관용적으로 대문자
 
 JAVA : final int NUM =10;
 C#   : const integer NUM=10;
 
 final 키워드
 1. final class Car{} >> 상속금지
 ex) public fianl clas Math extends Object
 
 2. public final void print(){} >> 상속관계에서 재정의 금지(override)
 
 3. member field (상수) 중요
 
 
 */

class Vcard{
	final String KIND = "heart"; 
	final int NUM = 10;
	
	void method() {
		//JAVA API
		System.out.println(Math.PI);
	}
}




//설계자 입장에서 
// 53장의 카드 생성시 카드마다 다른 상수값을 가지게 하고 싶다.
class Vcard2 {
	final String KIND;
	final int NUM;
	//밎은 무조건 초기화 될거야 -> 초기값을 무조건 준다(X) -> 초기화를 보장
	//member field 초기화
	
	//Vcard2() {}
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
	
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}


public class Ex07_final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		//vcard.KIND = "AAA" 변경불가 - 상수는 한번 초기화되면 값을 바꿀 수 없다.
//		System.out.println(vcard.KIND);
//		vcard.method();
		
		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade",2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("spade",1);
		System.out.println(v3.toString());
		//v3.KIND = "aaa";
	}

}
