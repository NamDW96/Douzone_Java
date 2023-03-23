import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
			
		//반복문 (while, do ~while)
		//int i = 10;
		//while(i>500) {//true
			//반드시
			//증가감을 통해서 true, false 판단
			// 증가감의 위치도 고민하자
			//System.out.println(i);
		//}
		
		int i1 = 1;
		int sum =0;
		while(i1<=100) {
		    sum+=i1;
			i1++;
		}
		System.out.println(sum);
		
		//while 구구단
		
		int i=2;
		int j=1;
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
				j++;
			}
			System.out.println("");
			i++;
			j=1;
		}
		
		//for() {if(조건) break;}
		//while(true_ {if(조건)break;}
		//do while : 일단 한번은 강제적으로 수행 ..그리고 조건을 보고 판단한다
		//do {실행블럭} while(조건판단)
		Scanner sc = new Scanner(System.in);
		int inputData=0;
		do {
			System.out.println("숫자 입력해 (0~9)");
			inputData = Integer.parseInt(sc.nextLine()); 
		} while(inputData >=10); //while 조건이 true -> 계속해서 do 문을 실행
								 //while 조건 false -> do 실행하지 않음.
		System.out.println("당신이 입력한 숫자는 : "+ inputData);
		
		
		
	}

}
