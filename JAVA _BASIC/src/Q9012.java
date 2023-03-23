import java.util.Scanner;

public class Q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int unit = 10000;
		int num = 0;
		int sw = 0;
		
		int money = Integer.parseInt(sc.nextLine());
		

		while(unit>1)
		{
			num = money / unit;
			System.out.println(unit+" - " +num+"개");
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
