import kr.or.kosa.Singleton;

public class Ex15_Singleton_Main {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s == s2 && s2 == s3 && s == s3);
	}
}
