// Refactor를 사용하여 이름을 바꾸면 클래스의 이름도 바꿔줌 // 개꿀

/*
static member field : 객체간 공유자원
static method : >> public static void main

static method 를 사용하는 이유
1. 객체 생성 없이 사용
2. 편하고 빠르게 사용하려고
3. 많이 사용하니까  ex) System.out.println();
4. 설계도 : 자원을 많이 사용할 것 같다 >>..... new ... 참조변수 ....
  >>자원을 많이 사용 >> 편하게 쓰게 하자 >> new 없이 사용 >>기능 (static 설계)
  
  System system = new System();
  System.out.prin.... << 요런거 안하려고
  
*/


class StaticClass{
	int iv;
	
	static int cv;
	
	static void print() {
		System.out.println("static print");
		//static 함수
		//일반자원 int iv; >> 생성 시점은 (static 자원은 일반 자원보다 우선한다)
	}
	
	void printIv() {
		//일반함수내에서 static cv값(static자원)을 사용할 수 있을까?
		// why : static 자원은 객체 생성 이전에 memory에 로드되어 있기 때문에
		
		cv = 100;
	}
}

//(static 함수,자원 / instance 변수, 함수) 공존의 관계 : 생성시점


//공존의 관계 : 생성시점에 대한 해결제시
//
public class Ex08_Static_Method {
	public static void main(String[] args) {
		StaticClass.print();
		
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv);
	}
}
