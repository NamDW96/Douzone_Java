/*
 오류
 1. 에러(error)     : 네트워크 장애, 메모리 , 하드웨어 문제 >> 개발자 코드적을 해결 불가
 2. 예외(Exception) : 개발자가 코드 실수로 발생 >> 문제 발생 코드 찾아서 >> 수정 >> 배포
 2.1 컴파일시 예외    : 실행파일이 생성되지 않음 
 2.2 런타임시(실행도중) 문제 발생 : 문제가 생긴 시점에 프로그램 강제 종료. >> 문제발생지점 이후의 코드 실행 불가
 
 예외처리 : 프로그램이 안정적으로 종료 >> 나면 원인 분석 >> 코드 수정... >> 다시 배포
 
 try{
 		>>문제가 의심되는 코드
 		>>문제가 발생되면?? >> 예외가 발생한 정보를 담을 수 있는 객체 자동생성
 		ex) 
 		>>[0][1][2] >> car[3] = " " >> ArrayIndexOutOfBoundsException(생성) >> 예외담기
 		>> new ArrayIndexOutOfBoundsException("정보")
 }catch(Exception e){  //Exception 모든 예외의 부모타입 
 		>> 문제 파악
 		>> 처리(코드는 수정되지 않는다) 보고
 		>> 1. 관리자 email
 		>> 2. 로그기록 (장애 발생 기록)
 		>> 3. 강제 종료를 막는다.
 }finally{
 		>> 문제 발생유무와 상관없이, 강제적으로 실행되는 코드
 		>> 함수에서 return 만나면 종료의 의미. > return을 만나도 finally 강제 실행
 		>> DB작업중 문제 -> DB자원 종료(해제)를 강제
 		
 }
 
 */
public class Ex01_Exception {
	public static void main(String[] args) {
	/*	
		System.out.println("main start");
		System.out.println(0/0);
		//문제가 발생하면 발생된 시점에 종료되어 .. 더 이상 코드 실행하지 않는다.
		System.out.println("main end"); */
		
		System.out.println("main start");
		try {
			System.out.println(0/0);
		}catch(Exception e) { //부모타입 변수는 자식타입의 주소값을 받을 수 있다 (다형성)
			// 문제 파악... 전달
			System.out.println("문제 발생" + e.getMessage());
			e.printStackTrace();
			/*
			 * 
			java.lang.ArithmeticException: / by zero
			at Ex01_Exception.main(Ex01_Exception.java:40)
			
			*/
		}
		System.out.println("main end");
		
		
	}
}
