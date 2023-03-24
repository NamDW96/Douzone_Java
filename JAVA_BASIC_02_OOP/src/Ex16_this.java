/*
 원칙 : 객체를 생성할 때 생성자는 1개만 호출 가능하다. ( new Zcar() ,,, new Zcar(10))
 
 this >> 객체 자신
 
 Zcar(){} 와 this(){}를 같은 것으로 본다.
 
 */

/*

class Zcar{
	String color;
	String gearType;
	int door;
	
	Zcar(){ // 기본 설정 -되도록 member field에 초기화 ㄴㄴ
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	}
	Zcar(String color, String gearType ,int door){
		this.color = color; //parameter로 받은 값을 맴버 필드의 값으로 한다.
		this.gearType = gearType;
		this.door = door;
	}
	void ZcarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " +this.door );
	}
}*/

class Zcar{
	String color;
	String gearType;
	int door;
	
	Zcar(){ // 기본 설정 
		
		this("red","auto",2); //다시 호출 .. 생성자를 다시 호출
		
		System.out.println("overloading parameter 1개 call");
		//this.color = "red";
		//this.gearType = "auto";
		//this.door = 2;

	}
	Zcar(String color, String gearType ,int door){
		this.color = color; //parameter로 받은 값을 맴버 필드의 값으로 한다.
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading parameter 3개 call");
	}
	void zcarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " +this.door );
	}
}

class Zcar2{
	String color;
	String gearType;
	int door;
	int year;
	
	Zcar2(){ // 기본 설정 
		this("red",2);
		System.out.println("default.......");
		// 기본 옵션(red,2,auto)
	}
	Zcar2(String color,int door){ //기본설정에 색상과 문의 개수는 선택가능
		this(color,"door",door);

		//옵션 color door 변경 (default auto)
		System.out.println("overloading parameter 2개 call");
	}
	Zcar2(String color, String gearType ,int door){ //모든 옵션은 변경가능
		this.color = color; 
		this.gearType = gearType;
		this.door = door;
		//옵션 : color ,door, gearType
		System.out.println("overloading parameter 3개 call");
		}

	void ZcarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " +this.door );
	}
}



public class Ex16_this {
	public static void main(String[] args) {
//		Zcar zcar = new Zcar();
//		zcar.zcarPrint();
		
		Zcar zcar2 = new Zcar("yellow","auto",10);
		//zcar2.zcarPrint();
		
		Zcar2 car = new Zcar2(); // 기본옵션
		
		//Zcar2 car2 = new Zcar2("gold", 18);
		//Zcar2 car3 = new Zcar2("gold", "auoto", 20);
		
		
	}
}
