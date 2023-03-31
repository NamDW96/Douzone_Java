/*
 ☆★Today Point★☆
 user 사용자 <> provider 제공자
 
 class A {}
 class B {}
 
 관계 : A는 B를 사용합니다.
 
 1. 상속 : A extends B
 2. 포함 : A라는 클래스가 member field로 B를 사용 class A { B b;}
 2.1 부분
 2.2 전체  			//부분 -전체 여부 : lifecycle이 동일한가의 여부
 
 classB {}
 classA {
 	int i;	 
 	B b; 	 // A는 B를 사용합니다. (포함)
 	A() { //생성자
 		b = new B();
 	}
 }
 >> main(){
 	A a = new A(); //lifecycle이 같다(공동운명체)
 	a.b.자원명
 	
 }
 
 포함관계 
 >>B는 독자적인 생성이 불가능하다 >> A 객체가 생성되면 B도 같이 생성된다.
 >>공동운명체?(전체집합)?composition?
 >> ex) 자동차 엔진 , 노트북과 cpu
 
 
 class B{}
 class A{
 	int i;
 	B b; 	//A는 B를 사용합니다 (포함관계)
 	A(){
 	
 	}
 	
 	//method
 	void m(B b){
 		this.b = b;
 	}
 	
 >> main(){
 	A a = new A(); 
 	a = null;
 	B b = new B();
 	//필요에 따라서
 	a.m(b);
 	//같은 운명은 아니다
 	//부분집합
 	// ex) 노트북과 마우스, 학교와 학생
 }
 
 A는 B를 사용합니다(참조) >> 포함 >> A가 B를 member field >> 생성(같이) ,따로 
 
 */
interface Icall{
	void m(); //public abstract void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D ... Icall 인터페이스의 m() 재정의");
	}
}

class F implements Icall{

	@Override
	public void m() {
		System.out.println("F ... Icall 인터페이스의 m() 재정의");

	}
}

// 현대적인 프로그래밍 방식은 (interface가 대세) >> 유연성 >> 대충 만들어도 대충 ...
// 느슨하게 (다형성) >> interface

class C {
	void method(Icall ic) { 
		// ★함수의 parameter는 Icall 을 구현하고 있는(부모로 두고있는) 모든 객체의 주소★
		ic.m();
	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);
		
	}
}
