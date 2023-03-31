
class Ssystem{
	
	public static final print out;
	static {
		out = new print();
	}	
}

class print {
	void add(int i) {System.out.println(i);}
	void add(String s) {System.out.println(s);}
}


public class Ex14_Quiz {
	public static void main(String[] args) {
		
		
		//System.out.println 과 같은 함수 만들기
		Ssystem.out.add("111");
		
	}
}
