import java.util.Scanner;

public class Jumin {
	
	public static  boolean lengthcheck(String jumin) {
		if(jumin.length()==14) {
			return true;
		}
		else return false;
	}
	public static boolean ofcheck(String jumin) {
		String[] ab = (jumin.substring(jumin.indexOf("-")+1)).split("");
		if(ab[0].equals("1")||ab[0].equals("2")||ab[0].equals("3")||ab[0].equals("4")) {
			return true;
		}
		else {
			System.out.println(ab[0]);
			return false;
		}
	}
	
	public static String mancheck(String jumin) {
		String[] ab = (jumin.substring(jumin.indexOf("-")+1)).split("");
		if(ab[0].equals("1")||ab[0].equals("3")) {
			return "남자";
		}
		if(ab[0].equals("2")||ab[0].equals("4")) {
			return "여자";
		}
		return "?";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String jumin = sc.nextLine();
		while(lengthcheck(jumin)) {
			while(ofcheck(jumin)) {
			System.out.println(mancheck(jumin));
				System.exit(0);
			}
		}	
	}
}
//String a = jumin.substring(jumin.indexOf("-")+1);
//System.out.println(a);
//String[] ab = a.split("");
//
//System.out.println(ab[0]);
