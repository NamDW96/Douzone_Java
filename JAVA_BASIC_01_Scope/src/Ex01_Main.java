import kr.or.kosa.common.Car;


/*
클래스 == 설계도 == 타입(사용자 정의)

클래스의 구성 요소 (설계도라고 판단하려면 최소한 무엇을 가지고 있어야 한다.)
[필드 + 메소드] + 생성자
(속성 + 함수(기능))

필드 (member field) >> 데이터, 자료에 대한 정보를 담고있다. >> [고유정보], [상태정보], [부품정보]
고유정보 : 크게 변하지 않는값 / 상태정보 : 상황에 따라 값이 바뀌는 정보 / 부품정보 >> 다시 나누어 질 수 있음.
field >> variable

함수 (mathod) >> 기능(행위) >> ex)자동차 -달린다, 멈춘다, 소리가 난다 ...

+추가저으로 생성자(함수) >> 특수한 목적의 함수 
>> 객체가 생성시 member field 초기화 목적 생성되는 함수, getter, setter(read, write)

class 설계도 {
	고유정보
	상태정보
	부품정보
	
	기능(행위)
} ^ㅇ^
 
 클래스, 필드, 생성자함수, 메서드 : (범위가있음-메모리)영역 << 생성되는 장소(위치) or 접근자 (한정자, 수정자)
	
	장소(위치) : 폴더(package)를 기반으로... 클래스 내부 or 함수 내부, 제어문 내부 인가에 따라 범위 및 접근자가 달라짐
	접근자    : public. private, default, protected  
	
	kr.or.kosa.common 안에 생성한 Car 클래스는 > public class Car() >> 전부 오픈할거임.
	kr.or.kosa.common 안에 생성한 AirPlane 클래스 > class AirPlane >> 같은 폴더안에서만 사용가능
	
>>(접근자) default 같은 폴더에서만 공유 / 같은 패키지 내에서만 유효
>> 연습용으로 사용 or 특정 클래스의 도움을 주는 클래스 생성시

연습용으로 빠르게 작업하려면 어떤 방법이 제일 편하?
하나의 물리적 자바 파일은 여러개의 클래스를 가질 수 있다.
>> Ex01_Main.java 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다.
1. 개발에서는 필요한 클래스는 package를 생성하고 그 안에 만들어서 사용함. Car 클래스 처럼
2. 그냥 연습... 굳이 패키지 생성하고 싶지 않아, 물리퍼적파일 여러개 만들 필요가 있을까 
3. 하나의 물리적 파일에 여러개의 클래스를 사용할 수 있게 해줌(연습..)
3.1 public 접근자는 한개만 갖는다.

 */
class Emp{	// 이런방식은 연습할때나 사용.
}

class Dept{  // 컴파일러가 default class Dept 해석
	int deptNO; // 컴파일러가 default int deptNo 해석
	public String dname; // 이경우 Dept에 접근 못하는? public?
						//에러는 아니지만 다른 폴더 사용 불가 public 의미 없다.
	private int count; // private캡슐화(은닉), 감추다 ,숨기다
					 // 설계자의 의도 : 클래스 내부에서만 사용 목적
	                 // 설계자의 의도 : 직접 할당을 막고 간접할당을 활동의 제어 하겠다.}
	
	//특수한 함수
	//getter(읽기 전용), setter(쓰기전용)
	public int getCount() {
		return this.count;
	}
	public void set(int count) { //r\간접할당
		if(count < 0){
			this.count = 0;
		}
		else {
		this.count = count;
		}
	}
	
/*class Apt{
	
}*/

//연습용
class Test{	  //default
	int data;    //default 클래스가 가지는 변수 -(member field) >> instance variable
	
	void print() { //default
		int num=0; //local variable <- 지역변수는 초기화를 해줘야한다.
		for(int i=0; i<=100; i++) { 
			
		}
		int k=0; //local variable
		for(/*int*/ k=0; k<=100; k++) { //변수의 scope을 아는것이 중요!
			
		}
		System.out.println(k); //출력되는 k값은 101
	}
}

//data 변수는 : Test test = new Test(); 객체생성했을 때 생성된다.
//num 변수는 print() 메소드가 호출 되었을 때 메모리에 생성된다.
//int i 변수는 for문이 실행될 때 만들어진다. block variable


/*
 폴더

 */
 public class Test{
  private int i;
  
  public void sesI(int i){
  	this.i = i;
  }
  public int getI(){
  	return this.i;
  }
  
  public void print(){
	  
  }
 }
 
 







public class Ex01_Main {

	public static void main(String[] args) {
		//같은 폴더 안에 있는 클래스
		Apt apt = new Apt();
		Car car = new Car(); // public class Car{} 폴더에 구분없이 어디서나 사용 가능하다
		//import 가 없는 경우
		//kr.or.kosa.common.Car car = new kr.or.kosa.common.Car(); // public class Car{} 폴더에 구분없이 어디서나 사용 가능하다 
		
		
		Dept dept = new Dept();
		//count. 같은 폴더 같은 파일안에 있더라도 private에는 접근 불가 
		dept.deptNO = 100;
		System.out.println(dept.deptNO);
		
		dept.dname ="IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.count);
		
		Test test = new Test();
		test.print(); //
	}

}



public void setCount(int i) {
	// TODO Auto-generated method stub
	
}}
