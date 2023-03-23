import java.util.Scanner;

public class Ex06_Operation {

	public static void main(String[] args) {
		//대입연산자
		// +=, -=, *=, /=
		
		/*int sum = 0;
		sum += 1;
		sum -= 1;
		System.out.println("sum : " + sum);*/
		
		
		/* 
		 if(조건식){ }

		 if(조건식){ } else { }
		 
		 if(조건식) else if { } ... else
		 
		 간단한 학점 계산기
		 
		 학점 : A+ A- B+ B- .... F
		 
		 판단기준 : 90점 이상 이고 95점 이상이면
		 90 80 70 나머지
		 
		 */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";
		
		if(score >=90) {
			if(score >=95) {
				grade = "A+";
			}
			else {
				grade = "A-";
			}
		}
		/*if(score >=90){
		  grade="A";
		  	if(score >=95){
		  		grade +="+";
		 	}else{
		 		grade +="-";
		 	}
		 
		 */
		else if(score >=80) {
			if (score >=85) {
				grade="B+";
			}
			else {
				grade ="B-";
			}
		}
		else if(score >=70) {
			if(score>=75) {
				grade="C+";
			}
			else {
				grade ="C-";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("학점은 : "+ grade + "입니다.");
		
		//삼항연산자
		grade = (score > 95) ? (grade+="+"):(grade+="-");
		/*if(score >=90){ 위의 삼항연산자와 같다.
		  grade="A";
		  	if(score >=95){
		  		grade +="+";
		 	}else{
		 		grade +="-";
		 	}
		 
		 */	
				
				
				
				
				
			
		
		
		
		
		
		for(char i = 'A'; i<= 'Z'; i++) {
			System.out.println(i);
		}
		
		for(int i=65; i<=690; i++) {
			System.out.println((char)i + " ");
		}
		System.out.println(); //엔터처리
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if (i%10 == 0) {
			System.out.println();
		
			
			
			}

		}
		//입사시험 (가장 많이 나오는 문제)
		//hint) 제어문 (반복문)
		//구구단 (행 열 개념)
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				//
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+ "X"+ i + "=" +i*j + "\t");
			}
			System.out.println("");
		}
	
	}
	
	
}
