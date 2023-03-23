/*
static 초기화
1. static variable : 공유자원 (객체간 공유자원) : 객체마다 같은 값을 공유
2. instance variable : 생성되는 객체마다 다른 값을 가지게 한다

두 자원은 default 값을 가지고 있으므로 초기화를 할 필요는 없다.
초기화를 꼭 할 필요는 없지만 instance variable을 초기화 하는 것은 객체마다 같은 값을 갖도록 하는 것.
 
 
 */
class Test2{
	static int cv =10; // 초기화
	static int cv2; // default >> 0
	int iv = 9;
	// 3 녀석은 default 값이 있어서 초기화를 하지 않아도 사용하는데 문제는 없다.
	
	//for(int i) << 클래스에는 맴버필드와 함수만 올 수있다. 제어문은 함수 내부에만 올 수 있다.
	
	
	
	// 1. static 자원에 대한 초기화 static {} << static 초기화 블록
	static {
		//이렇게 초기화 할 수 있는 이유 >> 실행되는 시점 
		//static int cv =10; static int cv2;  메모리에 올라간 직후 자동 호출(실행)
		
		cv = 1111; 
		//조작된 표현이 가능
		cv2 = cv + 2222; //13번째라인에서 선언한 static 변수를 << 와 같이 초기화하기위해 사용 (가끔씀)
		
	}
	
	// 2. 일반 자원 (member field) 초기화 블럭 {} // 일반 초기화블럭은 생성자에게 밀려 잘 사용되지 않는다.
											// 생성자 함수와 기능이 동일 (인기↓)
	{
		//int iv = 9; 메모리에 올라가려면 >> Test2 test2 = new Test2();
		// {} 초기화 블럭 언제 ... 객체가 만들어지고 member field가 memory(heap) 에 올라간 직후 블럭 실행
		// 이렇게 초기화 블럭을 사용하는 이유 >> 조작된 값을 사용하기 위해서
		// ex) if(iv >10) iv = 100;
		System.out.println("초기화 블럭 실행");
		if(iv < 10) iv = 10000;
		
	}
	//되도록이면 초기화 블럭을 통해 초기화를 하는 것이 건강하다.
	
}
public class Ex07_Static_init {
	
	public static void main(String[] args) {
		
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
		
		Test2 t2 = new Test2();
		System.out.println(t2.iv);
	}
	
	
}
