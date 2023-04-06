package kr.or.kosa.dz;

import java.util.Scanner;

public class Q2559 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int max=0;
		
		int[] arr = new int[N];
		int[] arr2 = new int[N-K+1];
 		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=i; j<K+i; j++) {
				arr2[i] += arr[j];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(max<arr2[i]) {
				max =arr2[i];
			}
		}
		System.out.println(max);
		
		
	}
}
