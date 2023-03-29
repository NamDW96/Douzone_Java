/*
 OOP 특징 (여러개의 조각)(작은)(클래스) 들을 조립해서 하나의 큰 그림을(제품)을 만드는 행위 
 설계도 : 메인 설계도의 부분 설계도, 메인 설계도 하위 설계도, 별도 독립적인 설계도 .....
 객체지향 언어는 계층적 상속만을 한다
 
 1. 상속
 2. 캡슐화(은닉화) >> private 
 3. 다형성 (상속관계에서 부모 타입이 자식 타입의 주소를 가질 수 있다)
 
 
 상속
 JAVA : child extends Base
 C#   : child : Base
 
 /특징
  * 1. 다중 상속 불가(단일 상속 원칙 >> 계층적 상속)
  * 2. 계층적 상속(여러개의 클래스를 상속)
  * 3. 다중 상속 지원은 interface 만 (표준, 약속, 규칙, 규약)을 정의하고 있는 클래스
  * 
 상속
 1. 진정한 의미 : 재사용성
 2. 단점 : 비용(초기설계비용)  ...부모와 자식간의 관계가 강함(커플링) >> trend 느슨한 관계를 좋아함
 3. 재사용성 >> 설계 >> 시간 >> .... 재사용성 높아져서 ...
 
 모든 클래스는 메모리에 올라가야 사용가능 하다
 
( Object >>) GrandFather >> Father >> Child

사용자가 만드는 모든 클래스는 default (명시하지 않아도) : Object 상속한다.

class Car (extends Object 생략)
Object >> Root >> 최상위 >> 모든 클래스의 부모 클래스
 */
class Car{ // Car extends Object
	
}

class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000; // 상속관계에서 접근 불가 
								// public 함수 생성 (간접적인 접근 가능)
	//객체 생성과 동시에 호출되는 함수 >> 생성자
	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}
}

class Father extends GrandFather{
	public int fmoney = 3000;
	public Father() {
		System.out.println("Father 생성자");
	}
} 

class Child extends Father {
	public int cmoney = 100;
	public Child() {
		System.out.println("Child 생성자");
	}
}


public class Ex01_inherit {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		//child.pmoney; 상속관계에도 접근 불가
	}
}
