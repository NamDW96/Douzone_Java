package kr.or.kosa;
/*
디자인 패턴 (생성에 관련된 이야기) >> new

싱글톤 : 객체 하나를 만들어 공유
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라

공유프린터기
공유 IP


Singleton s = new Singleton();
Singleton s2 = new Singleton();
Singleton s3 = new Singleton();

*/



public class Singleton {
	private static Singleton p;
	private Singleton() {
		//생성자의 접근자를 private으로 >> 생성자 호출을 막아서 객체 new할 수 없게..
	}
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //☆★☆★POINT - 같은 클래스 내에서는 public, private 차이없다.
		}
		return p; //class Area에 생성되기 때문에 항상 같은 주소(메모리)를 보장한다.
		//한개의 객체를 만드는것을 보장하는 패턴 - 싱글톤
	}
}
