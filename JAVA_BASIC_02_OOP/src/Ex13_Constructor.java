/*
본인을 객체로 표현해 ! < 더존 면접질문중 하나

생성자 함수(constructor)
1. 특수한 목적 함수
2. 목적 (member field 초기화) >> static {}, {초기자 블럭} (스태틱 초기화 , 일반초기화)  
                                   생성자 대체로인해 초기자 블럭이 잘 사용되지 않는다.
3. 일반 함수와 다른점
3.1 함수 이름이 고정(class 이름 동일)
3.2 return type 없음. (객체 생성과 동시에 호출) (return 을 받을 대상이 없다.)
3.3 실행시점 > new 객체 생성 > heap 객체 생성 > member field 자리잡기 > 자동으로 생성자 함수 호출
3.4 return type(x) >> void >> public void(생략) 클래스 이름 >> public 클래스이름(){}

4. 왜 만들까 : 생성되는 객체마다 ★강제★적으로 member field 초기화 하고싶어서.

class Car { String color;}
>> 설계도를 만든이는 자동차 색상은 니가 알아서 해} (안해도 어쩔 수 없어)

class Car {String color = "blue"}
>> 객체를 생성하면 무조건 자동차의 색상은 blue

문제) 자동차의 색상을 정하지 않고 출고
설계도를 사용하는 사람이 자동차를 만들때 색상을 넣지 않으면 출고 안되게 하고싶다.
>> 생성자 설게도, 강제 하지 않으면 객체 안만들어져

5. 생성자 함수 1개 만들까
6. 생성자 함수는 overloading 가능 (강제 구현) ** Today Point
***** 생성자 함수를 쓰는 가장 중요한 목적은 member field [강제적] 초기화

 */

class Car {
	String carname = "포니";
	
	//생성자 (default constructor) >> 기본 생성자
	public Car() {
		System.out.println("기본 생성자");
		carname = "내맘";
	}
}

class School{
	String schoolname ="강남";
	
	//public School() {}
	//컴파일러가 만약 school 객체 때, 생성자 함수가 없다면
	//자동으로 생성자(default) 만들어서 실행
}
/////////////////////////////////////////////////////
class Car2{
	String carname;
	//생성자가 생략되어 있다.
	//public Car2(){}
}

class Car3{
	String carname; // null
	public Car3() { // (parameter가 없는 생성자 함수 =) default constructor (=method)
		carname = "포니";
		
	}
}

//Today Point - 생성자의 오버로딩

// 설계도는 자동차를 만드는 데 있어서 2가지 선택
class Car4{
	String carname;
	public Car4() {
		carname ="기본이름";
	}
	//overloading (함수) >> 생성자 함수(특수한) >> 생성자도 오버로딩이 가능하다.
	public Car4(String name) {
		carname = name;
	}
}

//설계의도 - default (생성자를 생성할 수 없다.)
// default 생성자는 컴파일러에 인해 자동 생성되지만, overloading 생성자가 한개라도 있다면
// 자동으로 생성되지 않는다.
// 즉 아래 Car5는 객체를 생성하기위해서는 반드시 이름(String)을 입력하라는 것.
class Car5{
	String carname;
	public Car5(String name) {
		carname = name;
	}
}

class Car6 {
	String carcolor;
	int door;
	public Car6() {
		carcolor="blue";
		door=4;
	}
	public Car6(int num) {
		carcolor="blue";
		door=num;
	}
	public Car6(String color) {
		carcolor=color;
		door=4;
	}
	public Car6(String color, int num) {
		carcolor = color;
		door = num;
	}
}
//객체 지향을 할 때, 실제 사례에 대입하면서 하는것이 좋다.




/////////////////////////////////////////////////////
public class Ex13_Constructor {
	public static void main(String[] args) {
		Car car = new Car();// Car()생성자
		System.out.println(car.carname);
		School school = new School(); //생성자(default)호출하는 괄호
		
		Car4 car4 = new Car4();
		Car4 car41 = new Car4("법카");
		
		
		
	}

}
