
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("나는 메인양");
		
		worker();
		worker2();
		
		System.out.println("메인 종료");
	}
	
	static void worker() {
		System.out.println("나는 1번이야");
	}
	
	static void worker2() {
		System.out.println("나는 2번이야");
	}
}
