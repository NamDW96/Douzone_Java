
/*
 멀티 스레드 환경 ( 이슈 : 공유자원)
 
 synchronized (동기화)
 
 Collection (Vector, ArrayList) 비교
 
 Vector 동기화 보장 -> 멀티 스레드 환경 >> 자원 보호 > (Lock) > 성능 저하 ...
 ArrayList - 동기화를 보장하지 않는다 > 성능 보장 > 자원 보호를 보장하지 않는다.
 
 
 
 
 
*/

class Wroom{
	synchronized void openDoor(String name) {
		System.out.println(name + "님이 입장하셨습니다.");
		for(int i = 0; i< 100; i++) {
			System.out.println(name + " 사용 중 - " + i);
			if( i == 10 ) {
				System.out.println(name + "동작");
			}
		}
		System.out.println("==== 완료 ====");
	}
}

class User extends Thread {
	Wroom wr;
	String who;
	
	User(String name, Wroom wr){
		this.who = name;
		this.wr = wr;
	}
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}



public class Ex07_Sync_Thread {
	
	public static void main(String[] args) {
		
		Wroom w = new Wroom();
		
		User kim = new User("김시", w);
		User lee = new User("이시", w);
		User park = new User("박시", w);
		
		kim.start();
		lee.start();
		park.start();
	}
}
