import java.util.Vector;

/*
Collection FrameWork
[다수의 데이터]를 다루는 [표준화된 인터페이스]를 구현하고 있는 [클래스의 집합]

Collection 인터페이스 >> 상속 List >> 구현 ArrayList
Collection 인터페이스 >> 상속 Set >> 구현 HAshset

* ArrayList의 부모타입은 List 이다 (O) >> 다형성
* Cellection 인터페이스는 ArrayList 부모타입이다(O)
* instanceof 검증

Map 인터페이스 (key, value) 쌍의 배열 >> 구현 HashMap  ex)전화번호 02~ 031~

1. List (줄을 서시오) 
 순서가 있는 데이터의 집합(번호표) ... 중복 허용 >> 순서(o), 중복(o), 데이터 집합
 Tip) Array 키관리 >> 홍길동[][][][][][][] 단점.........
 
 1.1 Vector(구버전)     -> 동기화 보장 	(O)  >> Lock default
 				Vector (화장실) ->멀티스레드 환경(Lock) >> 성능(↓), 보안(↑)
 1.2 ArrayList(신버전)  -> 동기화를 보장하지 않는다. (X) >> Lock option
				ArrayList (비빔밥) -> 멀티 스레드 환경(Lock) >> 성능(↑), 보안(↓)
Vector 유지보수, 학습용
ArrayList 활용

-----------------------------------------------------------------
다수의 데이터를 다루는 방법 (Array >> 정적, 고정
☆★☆★ 방의 개수가 한번 정해지면 (방의 크기는 변경 불가) ☆★☆★

1. int[] arr1 = new int[5];
2. int[] arr2 = new int[]{1,2,3};
3. int[] arr3 = {1,2,3,4,5};

arr3에 데이터 100건이 추가
int[] arr4 = new int[100];
☆★☆★ 새로운 배열을 생성하고 데이터이동 (코드로 직접 개발자가 구현) ☆★☆★

Array
1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car()} 2개
2. 접근방법 (index) >> cars[0] .... n(length -1)

List 인터페이스를 구현하고 있는 ArrayList , Vcetor는 
1. 배열의 크기가 동적으로 확장 또는 축소 가능하다 >> 진실은 컴파일러가 새로운 배열을 만들고 데이터 이동...
2. 순서를 유지 (내부적으로 Array) 사용, 중복값 허용
3. 중복값 허용 (index를 통해서 제어)

*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 용량 : " + v.capacity()); 	// 10개짜리 정적배열 생성
		System.out.println("size (값의 개수) : " + v.size());  
		
		v.add("AA"); //순서 [0]		 //데이터를 넣는 함수
		v.add("BB");    // [1]
		v.add("CC");    // [2]
		v.add(10);
		System.out.println("size : " + v.size());
		System.out.println(v.toString()); // 배열의 값이 나오도록 toString() 재정의
		// Array >> 배열의 개수 >> length >> 방의 개수                  >> Car[0]
		// Collection >> size() >> 값의 개수           >> 객체 >> 함수적용 get(0)
		for (int i=0; i<v.size(); i++) {
			System.out.println(v.get(i)); //get(index) return 배열값 = Car[i]
		}
		//개선된 for문 출력
		for(Object s : v ) {
			System.out.println(s);
		}
		
		// 단점 : 작은 데이터 (같은 타입의 데이터) >>> 가장 큰 타입을 사용해서 얻는 것이 불합리
		// 제너릭 >> 타입을 강제 >> POINT
		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		for (String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector<>();
		System.out.println(v3.capacity()); //Object[] obj = new Object[10] 
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); //11번째

		System.out.println(v3.toString());
		System.out.println(v3.capacity());  //20개
		
		//그냥 편하게 쓰세여 (동적으로 늘어나고 줄어든다) - 하지만 사실은 새로운배열을 생성하고 데이터를 옮긴다. -아마도 면접에서 물어보는거?
		// 실제 개발할 때 Vector는 잘 안쓰고 - 과거의 프로그램들은 가지고 있을 수 있다.
		
	}
}
