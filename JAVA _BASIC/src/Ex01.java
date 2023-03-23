import kr.or.kosa.Car;

public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello3"); // Ctrl + f11 (저장 > 컴파일 >실행) 단축키
	}
	
	//자동차 생산
	// Car mycar;  < 스택에 생성됨. 함수안의 지역변수
	Car mycar = new Car(); // < 힙에 생성됨.
}
