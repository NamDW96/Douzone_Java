/*
OOP 객체 지향 프로그래밍 ( 여러개의 작은 조각(작은 설계도)만들어서 조합(큰 설계도로)하는 행위)
조합하는 방법 - 상속, 다형성, 의존, 연관... dependency...
>> 설계도를 재사용 

1. 상속 (재사용성) 
2. 캡슐화 (은닉화) : private ..setter,getter (직접 할당을 막고 .. 간접할당을 통해 데이터 보호)
3. 다형성 : 하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것. 
(현대적인 프로그램은 다형성을 원한다!!!! 상속을 줄이고?!!!?) 

>>method >> overloading (오버로딩) [method]
>>하나의 이름으로 여러가지 기능을 하는 함수 
>> System.out.println(); 이름은 1개... 기능 여러개(함수의 parameter 개수와 타입을 달리한다.)
>> printlnchar(), printlnString(), printlnBool() --> 외우기 힘듬.
1. 오버로딩을 사용하면 성능 향상(x)
2. 편하게 사용하려고 => 개발자가 편하게 사용 >> 설계자가 배려(개발자)
3. 오버로딩을 사용하지 않아도 문제 되지 않는다.

문법)
1. 함수의 이름은 같고 parameter의 개수와 타입을 달리하는 것 >> 오버로딩메소드
1.1 함수의 이름 동일
1.2 parameter의 갯수 타입 달리한다
1.3 return type 오버로딩의 판단 기준이 아니다.
1.4 parameter의 순서가 다름을 인정 ㅇㅇㅈ
ex) m(int i, String s), m(String s, int i) < 이걸 다르게 봄 - 순서가 다름

 */

class Human{
	String name;
	int age;
	
}

class OverT{ //설계도
	int add(int i) {
		return 100 + i;
	}
	
	//void add(int i) { } 충돌 (오버로딩이 아님)
	
	int add(int i, int j) { //parameter의 개수가 다름 >overloading
		return i + j;
	}
	
	String add(String str) { //paramter의 타입이 다름 > overloading
		return str;
	}
	String add (String s , int i) {
		return "hello" +s;
	}
	
	String add (int i, String s) {
		return "hello" +s;
	}
	
	//POINT
	void  add(Human human) { //인정 오버로딩
		human.age = 100;
		human.name = "홍길동";
	}
}



public class Ex11_Method_Overloading {
	
	public static void main(String[] args) {
		OverT overt = new OverT();
		overt.add(10,10); //parameter 정의가 일치하는 함후가 자동 호출
		//overt.add(10.1f,10);
		overt.add("A");
		
		//1.
		Human h =new Human(); //재사용할 필요가 있음
		overt.add(h);
		
		//POINT 2.
		overt.add(new Human());//재사용할 필요가 없음.
	}
}
