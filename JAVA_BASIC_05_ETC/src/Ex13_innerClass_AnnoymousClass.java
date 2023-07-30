/*
익명클래스 
클래스를 정의하지 않고 객체를 만드는 방법 > 1회용 클래스  > 재사용 불가능한 클래스

이벤트 처리, 스레드 객체 (runnable), 람다식, 스트림 사용 
   
*/
/*
  
inner class ( awt, swing, 안드로이드 앱, 등에 주로 사용됨) 
클래스안에 클래스

>>코드의 간소화


 */

class OuterClass {
	public int pdata = 10;
	private int data = 30;
	
	//inner class (자원에 대한 접근을 편하게 한다)
	//outerclass 의 member field 선언되는 곳에 만들면 된다
	class InnerClass {
		void msg() {
			System.out.println("outer class data : " + data);
			System.out.println("outer class pdata : " + pdata);
		}
	}
}

////////////////////////////////////////////////////////////////
abstract class Person{ // 강제적 구현
	abstract void eat();
	
}

class Man extends Person{
	@Override
	void eat() {
		System.out.println("Person 의 eat 함수 재정의");
	}
}

interface Eatable{
	void eat();
}

class Test{
	void method(Eatable e) { //parameter Eatable 구현한 객체의 주소 
		e.eat();
	}
}




public class Ex13_innerClass_AnnoymousClass {

	public static void main(String[] args) {
		OuterClass outobj = new OuterClass();
		System.out.println("public field : " + outobj.pdata);

		OuterClass.InnerClass innerobj = outobj.new InnerClass();
		innerobj.msg(); //outer 클래스에 대한 자원 접근 용이
		
		////////////////////////////////////////////
		
		Man m = new Man();
		m.eat();
		Person p = m;
		p.eat();
		
		Person p2 = new Man();
		p2.eat();
		///////////////////////////////////////////
		
		// abstract class Person 의 목적 => 강제구현 
		// 추상 클래스는 객체 생성 불가능 (미완성)
		// 추상 클래스를 상속하는 클래스 만들고 사용 .....
		// 한번만 사용, 재사용하지 않는 경우에 추상클래스를 상속하는 별도의 클래스를 만들 필요가 있을까?
		
		// Person 상속하느 클래스 없이 (이름 없이) 1회성으로 사용가능하게 하고 싶다
		// 익명클래스 만들자
		
		Person person = new Person() { //구현된 객체의 이름이 없다 => 익명객체 
			
			@Override
			void eat() {
				System.out.println("익명 객체 타입으로 구현");
				
			}
		};
		person.eat();
		
		////////////////////////////////////////////////////////////////////
		
		//TODAY POINT
		Test t = new Test();
		
		//원래대로면
		// class ManEat implements Eatable{} 로 구현하고 ManEat 객체를 생성하여 parameter로 넣어준다.
		
		
		t.method(new Eatable() { //eatable 인터페이스를 구현하고 있는 객체의 주소가 parameter로 와야한다. 
			
			@Override
			public void eat() {
				// interface를 구현한 1회성 코드를 작성
				System.out.println("일회성 자원으로 인터페이스를 구현");
			}
		}); 
	}
}
