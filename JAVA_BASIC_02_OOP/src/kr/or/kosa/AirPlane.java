package kr.or.kosa;

/*
	Airplane air101 = new AirPlane();
	air101.자원 = 대한항공
	air101.자원 = 707
	
	비행기 이름, 번호 출력
	
	
	*/
//public class Airplane {
//	
//	private static int airP_sum;
//	
//	private String airName;
//	private int airNum;
//	
//
//	public void makeAirplane(int num, String name) {
//		airNum =num;
//		airName = name;
//		airP_sum++;
//		AirDisplay();
//	}
//	public void AirDisplay() {
//		System.out.printf("비행기의 번호 :[%d],이름[%s]\n",airNum,airName);
//	}
//	
//	public void AirPlaneTotalCount() {
//		System.out.printf("총 제작 대수 : %d\n",airP_sum);
//	}
	

	
	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAirNum() {
		return airNum;
	}

	public void setAirNum(int airNum) {
		this.airNum = airNum;
	}
	
	public void setInfo(int airNum, String name) {
		this.name = name;
		this.airNum = airNum;
	}
	
	
	public void aircheck() {
		System.out.println("비행기 이름 : "+getName());
		System.out.println("비행기 번호 : "+getAirNum());
		airP_sum++; // 제작하지 않아도 대수를 늘릴 수 있음.ㅜ
		설계도는 요구사항에 맞게 제작해야한다.
	}
	*/
//생성자를 사용해서 아래 코드 수정

public class Airplane {
	
	private static int airP_sum;
	private String airName;
	private int airNum;
	
	public Airplane(int num, String name) {
		airNum =num;
		airName = name;
		airP_sum++;
		// 생성자는 함수를 호출할 수 없다.
	}
	public int getAirNum() {
		return airNum;
	}
	public String getAirName() {
		return airName;
	}
	
	public void airDisplay() {
		System.out.printf("비행기의 번호 :[%d],이름[%s]\n",airNum,airName);
	}
	
	public void AirPlaneTotalCount() {
		System.out.printf("총 제작 대수 : %d\n",airP_sum);
	}

	
}
