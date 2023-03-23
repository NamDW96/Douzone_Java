package kr.or.kosa;
/*
기능 (행위) 만드는 방법
method 만드는 방법(문법)

method : 행위 또는 기능의 최소단위 구현 : [하나의 함수]는 [하나의 기능]만 구현
ex)  먹는기능 , 자는 기능 

ex) 롯데월드 : 게임방 : 동전 (농구) , 동전 뽑기 (포켓몬)

** 모든 함수는 호출에 의해서만 동작한다 **
누군가 이름을 부르지 않으면 동작하지 않는다 

JAVA)
1. void , parameter(0) : public void print(String str) { 실행구문 }
2. void , parameter(x) : public void print() { 실행구문 }  공짜
3. return type , parameter(0) : public int print(int data) { return 100; }
3. return type , parameter(x) : public int print() { return 100; }

void  > 돌려주는 것이 없어요 > return type 없어요
return type >> 8가지 기본 + 1(String) , Array , class , interface , Collection
이 중에서 8가지 + String + class 학습

public boolean print(){  return true; }
Car print() { return  Car주소값 }
Car print() { return  new Car(); }
Car print() { Car car = new Car();  return car;}  목표 : 자유롭게 ...가지고 놀기

String print() { return "AAAA"; }


paramter type >> void print(String 변수)
parameter type >> 8가지 기본 + 1(String) , Array , class , interface , Collection

void print(int i){ }  >> 호출  print(100);
void print(String str) {} >> 호출  print("이예진");
void print(Car c) {} >> 호출 > Car c1 = new Car()  print(c1);  ....  print(new Car());

void print2(int a,  int b , int c){ } //나는 무조건 실행할때 3개 paramter  받겠다 강제

print2(10); (x)
print2(10,20) (x)
print2(10,20,"30")(x)
print2(1,2,3) (0)


함수의 이름 : 관용적
class Car , class Person

메서드 : getNumber();

사원테이블에서 사원의 모든 정보를 가지고 오는 함수를 만들어라
void getEmpAllList()

사원테이블에서 사원의 번호를 가지고 사원의  모든 정보를 가지고 오는 함수를 만들어라
void getEmpListByEmpno(int empno)

*/
public class Fclass {
	public int data; 
	
	// void m() >> 컴파일러가 >> default void m() >> 같은 폴더(package)내에서만 사용
	
	//함수의 접근자(수정자) : 70% public
	//홤수 30% private   : class  내부에서는 public , private  의미가 없어요 다 같은 식구일뿐
	
	//클래스 내부에서 사용해라 >> 이럼 함수 >> 다른 함수를 [도와주는 함수] (공통함수) 
	
	public void m() {  //void  parameter (x)
		//기능 구현
		System.out.println("일반함수 :  void , parameter(x)");
	}
	
	
	public void m2(int i) {
		System.out.println("일반함수 : void , parameter(0)");
		System.out.println("parameter 값을 활용 : " + i);
	}
	
	public int m3() {
		//강제로 return 구현
		return 10000;
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	//요기까지 가장 기본적인 함수 4가지
	//확장
	
	//return type (0) , parameter (0) 개수 .....
	public int sum(int i , int j , int k) {
		return i + j + k;
	}
	
	//함수의 접근자(수정자) 한정자
	// int sum();  >> 컴파일러가 >> default int sum();
	// private int sum() >> 객체입장에서 접근 불가 >> 같은 클래스 안에서 접근 가능 
	// 클래스 내부에서 다른 함수를 도와주는 공통함수 
	
	private int subSum(int i) {
		return i + 100;
	}
	//Fclass fclass = new Fclass();
	//fclass.보이지 않아요
	
	public void callSubSum() {
		int result = subSum(100); //private 함수
		System.out.println("call result : " + result);
	}
	
	public int opSum(int data) {
		//다양한 로직 (제어문)
		int result = subSum(data);
		//제어
		if(result > 0) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	//Quiz
	/*
	 함수를 생성하는데
	 정수타입의 parameter  2개를 받아서 둘중에 큰 값을 리턴하는 함수를 만드세요
	 ex) max(10,5) return 10이 반환되면 됩니다 
	 //100 , 90 , 60
	  
	 */
	 //30점 구현상에 문제는 없어요
	 //함수 구현시 유지보수 측면에서  return 을 최소화
	 /*
	 public int max(int a , int b) { 
	  		 if(a > b) {
	  		 	return a; 
	  		 }else { 
	  		 	return b; 
	  		 } 
	  }
	  */
	  //60점
	 /*
	  public int max(int a , int b) { 
	  		 int result=0;
		     if(a > b) {
	  		 	result = a;
	  		 }else { 
	  		 	result = b;
	  		 } 
	  		 return result; //return 1개 ...
	  }
	  */
	  //90점
	  /*
	  public int max (int a , int b) {
		  int max = (a > b) ? a : b;
		  return max;
	  }
	  */
	  //100점
	  public int max (int a , int b) {
		  return (a > b) ? a : b;
	  }
}






