
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		//국문과 학생의 기말고사 점수
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];
		int min = score[0];
		
		int m;
		int n;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max =score[i];
			}
			else if(score[i]<min){ //else if 구림 차라리 if 하나를 더 써. 
				min = score[i];
			}
		}
		//3항으로 하면 더 깔끔
//		max = (max < score[i]) ? score[i] : max;
//		min = (min > score[i]) ? score[i] : min;
		
		System.out.println(max+" " + min);
		
		//2
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i]+" ");
		}
		
		//3
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg =0f;
		System.out.println("과목의 수 : " + jumsu.length);
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		
		avg = sum/jumsu.length;
		System.out.println("평균 :" +avg);
		System.out.print("총점 :" +sum);
		
		/*
		 마지막 반복때만 평균을 구하면 for문 안에서 해결가능.
		for(int i=0; i<jumsu.length; i++) {
			sum+=jumsu[i];
			if(i==jumsu.length-1) { 
				System.out.println("점수의 합은 : " + sum);
				System.out.println("과목의 평균은 : " + sum/jumsu.length); =>sum/(float)jumsu.length 소수점까지 확인하고 싶다.
			} 
		*/
	}
}
