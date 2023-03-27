
public class Ex02_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		int num = 100; //local variable 초기화
		int result =0;
		
		
		//개발자가 의심되면 ...문제가..
		try {
			for(int i=0; i<10; i++) {
			result = num / (int)(Math.random() *10); // 0~9 난수
			System.out.println("result :"+result +" i :" + i);
				}
		}catch(Exception e) {// Exception e 유지보수가 힘들다. >> 가독성이 구림
			// Exception e 대신 AritehmeticExceoptoin 이 있었다면 더 알기쉬움
			System.out.println("문제 발생. 관리자 확인필요");
			System.out.println("원인 : " + e.getMessage());
		}finally {
			
		}
				
		System.out.println("main end");
	}
}
