
public class Star2 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i ==j ) {
					break;
				}
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		
		//100 부터 0까지의 출력 (시작값 100)
		for(int i=100; i>=0; i--) {
			System.out.println(i);
		}
		//피보나치 수열
		int a = 0, b=1, c=0;
		for(int i=0; i<10; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.printf("%d*%d =%d\t",a,b,c);
			System.out.println(" "+ c);
		}
		
		
		for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
			for(int j = 1 ; j <= 9 ; j++) {
				if( i == j) {
					continue; //continue 아래 구문 skip >> System.out.printf("%s","*");
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println(); //엔터
		}
	}
}
