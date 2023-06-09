import kr.or.kosa.Bird;

class Bi extends Bird {

	@Override
	protected void moveFast() {
		super.moveFast();
		
	}
	
}

class Ostrich extends Bird{
	//Ostrich
	//특수화 , 구체화
	void run() {
		System.out.println("run....");
	}

	@Override
	protected void moveFast() {
		run();
	}
	
	
}


public class Ex09_Inherit_Protected {
	
	public static void main(String[] args) { 
		Bi bi = new Bi();
		bi.fly();
		//bi.moveFast() protected는 자식의 참조변수로 참조 할 수없다.
		bi.moveFast();
		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();
	}
}
