import java.util.Scanner;

public class Q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = Integer.parseInt(sc.nextLine());

		while(true)
		{
			num = money / unit;
			System.out.println(unit+" - " +num+"개");
			
			if(unit <=1) break;
			
			money = money-unit*num;
			if(sw==0) {
				unit /= 2;
				sw =1;
			}
			else {
				unit /=5;
				sw = 0;
			}
		}	
	}
}
/*
public class Q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = Integer.parseInt(sc.nextLine());

		num = money / unit;
		System.out.println(unit+" - " +num+"개");
		
		while(unit>=1) // 이렇게 해버리면 출력을 위해 while 문을 한번 더 돌아야한다. 
		{
			money = money-unit*num;
			if(sw==0) {
				unit /= 2;
				sw =1;
			}
			else {
				unit /=5;
				sw = 0;
			}
			num = money / unit;
			System.out.println(unit+" - " +num+"개");
		}	
	}
}
//
 */
 
