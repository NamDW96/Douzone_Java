
public class Ex09_Static_Method {

	void method() {
		System.out.println("일반함수");
	}
	
	static void smethod() {
		System.out.println("스태틱함수");
	}	
	
	public static void main(String[] args) {
		smethod();
		Ex09_Static_Method ex09 = new Ex09_Static_Method();
		ex09.method();
		
		//Ex09_Static_Method.smethod();
		//ex09.smethod();
	}

}
