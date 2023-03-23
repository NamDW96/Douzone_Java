import kr.or.kosa.Airplane;

public class Ex05_Static_Airplane {
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane();
		a1.makeAirplane(1, "제주공항");
		
		Airplane a2 = new Airplane();
		a2.makeAirplane(2, "인천공항");
		
		Airplane a3 = new Airplane();
		a2.makeAirplane(3, "김포공항");
		a2.AirPlaneTotalCount();
		
		//AirPlane.airtotalcount (x) static private 접근 불가 (간접)
		//air1.airtotalcount (x)
	}
}
