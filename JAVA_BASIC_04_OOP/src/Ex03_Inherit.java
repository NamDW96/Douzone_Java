//두개의 설계도
class Tv{
	boolean power;
	int ch;
	
	void tvPower() { //두개의 기능을 하나의 함수 처리 - boolean type
		this.power = !this.power; // 전원스위치 - toggling 
	}
	
	void chUp() {
		ch++;
	}
	
	void chDown() {
		ch--;
	}
	
}

class Vcr{ //비디오 플레이어
	boolean power;
	void vcrPower() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {}
	void asd() {}
}

//설계도 2개
/*
 class Tv
 class Vcr
 
 제품
 Tv 와 Vcr 합쳐진 제품
 
 TvVcr 출시
 class TvVcr extends Tv, Vcr(x) 다중상속 금지
 >> 계층적 상속 ( 계층구조를 파악하기 힘듦.... 자원의 이름이 같을경우 충돌발생) 
 
 1. class TvVcr {Tv tv; Vcr vcr;}
 2. class TvVCR extends Tv { Vcr vcr; }
 둘다포함
 하나는 상속 나머지는 포함
 
 TvVcr의 기능에서 볼 때 메인 기능을 고려(비중, 가중치)
 */
class TvVcr{
	Tv tv;
	Vcr vcr;
	
	TvVcr(){
		this.tv = new Tv();   //초기화 (주소값 할당)
		this.vcr = new Vcr(); //TvVcr 과 TV VCR의 lifecycle이 같다. 같이 생성되고 같이 사라짐
	}
}

class TvVcr2 extends Tv{ //일반적으로 TvVcr 보다는 TvVcr2의 타입을 더 많이 사용
	Vcr vcr;			// 부모를 먼저 생성한다 (메모리에 먼저 올라감)
	TvVcr2(){
		this.vcr = new Vcr();
	}
}


public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr my = new TvVcr();
		my.tv.tvPower();
		my.vcr.vcrPower();
		System.out.println(my.tv.power);
		System.out.println(my.vcr.power);
		
		TvVcr2 tv2 = new TvVcr2();
		
		tv2.tvPower();
		System.out.println("TV전원 : " + tv2.power);
		
		tv2.vcr.vcrPower(); //TvVcr2에서 Vcr의 전원 함수를 동작
		System.out.println("VCR전원 : " + tv2.vcr.power );
	}
}
