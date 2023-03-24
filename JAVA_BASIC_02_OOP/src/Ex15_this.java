/*
 this(이것)
 1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
    >> 인스턴스 자신을 가르키는 참조변수 , 인스턴스의 주소가 저장되어있다.
    
    JAVA API - 인터넷이 작동하지 않는 곳에서 확인가능
    
 2. this 객체 자신 (주소) : 생성자 호출 (원칙적으로는 생성자는 객체 생성시 한개만 호출가능)
 	But, this를 활용하면 예외적으로 this를 통해서 여러개의 생성자를 호출 할 수 있다.
  
 
 */
class Test5 extends Object { //모든 클래스는 extends Object 가 생략되어있다 / default로 가지고 있다
	int i; 
	int j;
	
	Test5(){ // default 생성자
		
	}
	Test5(int i, int j){ //overloading constructor
		this.i = i;   //this는 Test5의 자원을 공유함.
		this.j = j;
	}
}

class Book2{
	
	String bookName;
	
	Book2(String bookName){ //parameter의 이름을 member field와 같은 것으로 한다.
	this.bookName = bookName;
	}
	
	/*
	Book2(String name){
		bookName = name; //코드를 예쁘게 >> 가독성을 높여라
	}
	*/
}



//Today Point - 생성자를 호출하는 this (중복코드에 대한 감소)

class Socar{
	String color;
	String gearType;
	int door;
	
	Socar(){ // 기본 설정 -되도록 member field에 초기화 ㄴㄴ
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	}
	Socar(String color, String gearType ,int door){
		this.color = color; //parameter로 받은 값을 맴버 필드의 값으로 한다.
		this.gearType = gearType;
		this.door = door;
	}
	void socarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " +this.door );
	}
}




public class Ex15_this {
	public static void main(String[] args) {
		Test5 test5 = new Test5(1, 5);
		
		Socar socar = new Socar(); //기본 옵션 선택
		socar.socarPrint();
		
		Socar socar2 = new Socar("blue","auto",6);
		socar2.socarPrint();
		
	}
}
