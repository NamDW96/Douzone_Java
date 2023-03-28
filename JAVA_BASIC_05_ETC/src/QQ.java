
public class QQ {
	public static  String splitfilename2(String filename) {
		int dot = filename.indexOf("-");
		String b = filename.substring(0,dot);
		String a = filename.substring(dot+1);
		return a+b;
	}
	public static void main(String[] args) {
		
	
		String jumin="123456-1234567";
		int sum14 =0;
		for(int i=0; i<13; i++) {
			sum14 +=Integer.parseInt(String.valueOf(splitfilename2(jumin).charAt(i)));
		}
		System.out.println("답 : "+sum14);
		
	}
}
