import java.util.ArrayList;
import java.util.List;

//교재 13장 Generic
/*
Today Point
jdk 1.5버전

C#, JAVA (필수기능)

1. 타입을 처음부터 강제할 수 있다.
2. 타입의 안정성 확보(타입강제)
3. 강제 형변환 필요 없다 ex_ (Car)Object 필요없다.

 */

//설계도를 만들떄
class MyGeneric<T>{ //Type parameter
	T obj;
	
	void add (T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;	
	}	
}

class Person{
	int age =100;
}


public class Ex04_Generic {
	public static void main(String[] args) {
		
	MyGeneric<String> mygen= new MyGeneric<String>();
		
		
		
	mygen.add("문자열");
	String str= mygen.get();
	System.out.println(str);
			
	ArrayList<String> list = new ArrayList();
	list.add("홍길동");
	
	ArrayList list0 = new ArrayList();
	list0.add(10);
	list0.add("홍길동");
	list0.add(new Person());
	
	//개선된 for문 사용해서 Person객체는 age값을 출력하고 나머지는 값을 출력
	
	for(Object obj : list0) {
		//System.out.println(obj);
		if(obj instanceof Person) {
			Person p = (Person)obj;
			System.out.println(p.age);		
		} else {
			System.out.println(obj);
		}
	}
	
	List<Person> plist = new ArrayList<>();
	plist.add(new Person());
	plist.add(new Person());
	for(Person p : plist) {
		System.out.println(p.age);
	}//클래스 생성할 때 객체에 타입을 저장ㅎ
	
	}
}
