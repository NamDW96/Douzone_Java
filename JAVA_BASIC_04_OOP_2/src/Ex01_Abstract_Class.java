/*
추상 클래스
>>미완성 클래스 (설계도)
1. 완성된 코드 + 미완성 코드
2. 미완성(함수) >> 실행블록이 없는 함수 >> public void run(); (X){}
3. 미완성된 클래스 (스스로 객체 생성이 불가능)
 
설계도를 만드는 입장에서
>>미완성 설계도 제작(미완성된 함수) >> 의도 >> 믿지 못하니까 >> 강제적 구현을 목적으로 

상속을 기반으로 .... 상속이 없으면 추상클래스 필요없음.

*/
class Car{
	void run() {} // 블럭만 있어도 객체 생성하고 사용하는데 문제없다
	//재정의 했으면 좋겠다 ... 강제성이 없다
}

class Hcar extends Car{
	//믿음 
	@Override
	void run() {
		System.out.println("재정의");
	}
}

// 강제성이 없다 (의무)
// 반드시 재정의를 하도록 만들겠다.
abstract class Abclass{ //클래스 안에는 최소 1개 이상의 추상함수(미완성함수)를 가지고 있다! 
	int pos;
	void run() {
		pos++;
	}
	
	// 재정의가 필요한 함수를 추상 함수로 설계
	abstract void stop(); //실행 블록이 없다 >>반드시 상속을 통해서 구현 >> 재정의를 해라
}

//상속을 통해서 구현
class Child extends Abclass{

	@Override
	void stop() {
		//구현하는 사람 마음대로 ...
		this.pos =0;
		System.out.println("Stop : " + this.pos);
	}
	
}

class Child2 extends Abclass {

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("Stop : " + this.pos);
	}
	
}


public class Ex01_Abstract_Class {
	public static void main(String[] args) {
		Car c = new Car();
		Hcar hc = new Hcar();

		hc.run();
		
		//Abclass ab = new Abclass();
		
		Child child = new Child();
		child.run();
		child.run();
		child.stop();
		
		Child2 child2 = new Child2();
		child2.run();
		child2.stop();
		/////////////////////////////////////
		//다형성
		Abclass ab = child;
		//상속관계에서 부모타입의 참조변수가 자식타입객체들의 주소를 받을 수 있다.(다형성)
		//단 부모는 자신의 것만 볼 수 있다.
		//단 재정의는 자식의 자원을 본다.
		
		ab.run();
		ab.stop(); //재정의 된 자식 함수 호출
		
		
	}
}
