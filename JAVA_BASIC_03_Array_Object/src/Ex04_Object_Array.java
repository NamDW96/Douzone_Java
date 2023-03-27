
class Person{
	String name;
	int age;
	
	// 만약 사람 만들때 이름, 나이를 강제하고 싶으면
//	public Person(String name, int age){
//		this.name = name;
//		this.age= age;
//	}
	
	void print() {
		System.out.println(this.name + " : " + this.age);
	}
}

public class Ex04_Object_Array {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] boolarr = new boolean[5]; //(default) false
		
		Person p = new Person(); //local 참조변수 p >> p라는 변수는 주소값을 가진다
		p.name = "홍길동";
		p.age = 100;
		
		//Person 타입의 사람 3명 만드세요 >> heap 메모리에 객체를 3개 만들어라
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		Person[] persons = new Person[3]; //방만 만들고 아무도 살지 않음 / Person 타입이 오는방
		System.out.println(persons);
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		System.out.println(persons[2]);
		
		persons[0] = new Person();//방은 주소값을 가진다
		
		Person p5 = new Person();
		persons[1] = p5;
		
		persons[2] = new Person();
		
		persons[2].name= "김유신";
		persons[2].age = 100;
		
		System.out.println(persons[2].name);
		System.out.println(persons[2].age);
		//초급자
		// 객체 작업은 방을 만드는 것과 채우는 작업은 별도다 ********
		
		// 객체 배열은 ..... 1.방만들기 , 2.방을 주소로 채우기 로 구성
		
		// 객체 배열 3가지 방법 ....
		// 1. int[] arr = new int[10]
		Person[] parray = new Person[10]; //방만 들었다 방에 default 값 nulll
		//parray[0] >> null 이 있다.
		//방에 들어갈 주소도 만들어야 한다. (Person 타입과 동일한 타입)
		for(int i=0; i<parray.length; i++) {
			parray[i] = new Person();
			System.out.println("주소값 : " + parray[i]);
		}
		/*객채배열은 방만들기 => 방채우기 => 채워지는것은 객체의 주소값
		 * 
		 * 
		 */
		
		//2. int[] arr = new int[]{10,20,30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()};
			 
		//3. int[] arr = {10,20,30}
		Person[] parray3 = {new Person(), new Person(), new Person()};
			 
			 
	}
}
