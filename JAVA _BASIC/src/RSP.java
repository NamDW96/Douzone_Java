import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int me = Integer.parseInt(sc.nextLine());
		String win="";
		int com =(int)(3*Math.random()+1); 
		System.out.println("컴퓨터 : " +com);
		
		if(me+com==4) win = (me > com) ? "LOSE" :((me==com) ? "DRAW" : "WIN");
		else win = (me > com) ? "WIN" :((me==com) ? "DRAW" : "LOSE"); // 1<2<3<1
		System.out.println(win);	
	}
}
