
class Unit2{
	int hitpoint;		//기본 에너지
	final int MAX_HP;	//최대 에너지
	
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}


//인터페이스
//~ 할 수 있는(수리할 수 있는)
interface Irepairable{}

//지상유닛, 공중유닛, 건물
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}

//공중유닛
class AirUnit extends Unit2{

	AirUnit(int hp) {
		super(hp);
	}
}

//건물
class CommandCenter implements Irepairable {}


//유닛
class Tank2 extends GroundUnit implements Irepairable{

	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}

}

class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}

}


//Scv 광물캐기, 수리 (탱크)
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "SCV";
	}
	
	//Scv 구체화, 특수화된 고유한 기능 구현
	//수리하다 (repair)
	//Tank2, Scv, CommandCenter
	
	//전자제품 매장 제품 1000개 >> buy() >> 1000개 buy함수 (X)
	//다형성을 이용하여 buy(Product n )(모든 제품의 부모타입) ...
	
	/*
	void repair(Tank2 tank) {
		
	}*/
	// 사고과정 >> 1.GroundUnit 부모 타입 사용 (marine)<- (X) 마린이걸림
	//void repair(Unit2 unit) >> marine + 공중유닛 / 마린과 공중유닛이 걸림.
	// repair 의 대상이 아닛 것들도 받아짐

	//CommandCenter repair 서로의 공통점이 없음(연결고리 >> 부모가 같지 않다)
	// Tank, Scv, CommandCenter 의 공통적인 부모 클래스가없고 공통점을 찾기위해 interface 사용
	
	//interface Irepairable{}
	
	// class CommandCenter implements Irepairable{}
	// class Tank2 extends GroundUnit implements Irepairable{}
	// class Scv extends GroundUnit implements Irepairable{}
	
	//공통점 : 부모로서 Irepairable 서로 연관성이 없는 자원에 대해서 같은 부모를 제공.
	
	//다형성
	void repair(Irepairable repairunit) {  //parameter에 interface 사용하는 게 중요!
		//Tank2 , Scv , CommandCenter
		//수리하는 방법이 달라?
		// Tank2 , Scv  >> HP 올려주면됨.
		// CommandCenter 다른 방법으로 repair
		
		//repairunit 일반 Unit2 판단해서 적용
		if(repairunit instanceof Unit2) {
			
			//Irepairable 최상위 타입이고 아무것도 가지고 있지 않다.
			//결국 hitpoint 나 MAX_HP 자원을 쓰기 위해서는
			// 한단계 아래의 Unit 으로 다운캐스팅 해야한다.
			// Tank2, Scv
			Unit2 unit2 = (Unit2)repairunit; //Irepairable repairunit 
			if(unit2.hitpoint != unit2.MAX_HP) {
				unit2.hitpoint = unit2.MAX_HP; //완충
			}	
		}
		else {
			//건물
			System.out.println("다른 충전 방식을 통해서 repair 합니다.");
		}
		
		
	}
	
}


public class Ex04_Interface_Poly {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Scv scv = new Scv();
		Marine marine = new Marine();
		
		CommandCenter center = new CommandCenter();
		
		//전투
		tank.hitpoint -= 20;
		System.out.println("탱크 : "+tank.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);
		
	}
}
