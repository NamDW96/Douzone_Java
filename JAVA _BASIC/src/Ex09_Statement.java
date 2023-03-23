//여기까지가 기본.


public class Ex09_Statement {
	public static void main(String[] args) {
		/*
		  제어문
		  조건문 : if(3가지) , switch(조건) {case 값 ... break}
		  반복문 : for(){}, 개선된for문??, while(){}, do{} ~ while()
		  분기문 : break, countinue(아래 구문 skip)
		  제어문을 암기하지 않으면 프로그램을 하지 않는것과 같다.
		 */
		int count =0;
		if(count < 1) System.out.println("true"); //단일 if문 {}(블록생략)
		
		if(count < 1) {
			System.out.println("true"); // 단일 if문
		}
		
		char data ='A';
		switch(data) {
		case 'A' : System.out.println("문자가 같다"); break;
		case 'B' : System.out.println("B온다");	   break;
		default : System.out.println("나머지 처리");
		}
		
		//for문
		//1~100까지 합
		/*int sum = 0;
		for(int i=1; i<=100; i++) {
			//System.out.prinln(i);
			sum += i;
		}
		System.out.println(sum);*/
		
		//1~5 까지의 합
		//for 믄과 while 문 쓰지말고
		//sum = 5 *(5+1)/2;	// 공식을 몰라도 풀 수 있도록 for문을 상ㅇ한다.
		//System.out.println(sum);
		
		//1부터 10 까지의 홀수 합
		 int sum2 = 0;
		for(int i=1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		int sum3=0;
		//for문에서 if문 사용해서 1부터 1000까지의 짝수의 합
		for(int i=0; i<=100; i++) {
			if(i%2 == 0) {
				sum3 +=i;
			}
		} System.out.println(sum3);
		
	
	}
}