package kr.or.kosa;

public class mh {
	public static void main(String[] args) {
		
		int win =0;
		int lose=0;
		
		int win2 =0;
		int lose2 = 0;
		
		for(int i=0; i<100000; i++) {
			
			int A = (int)(3 * Math.random() + 1);
			int P = (int)(3 * Math.random() + 1);

			int T = (int)(3 * Math.random() + 1);
			
			while(A==T || P==T) {
				T = (int)(3*Math.random() +1);
			}
			
			if(P==A) { win++; }
			else { lose++; }
			
			int C = (int)(3 * Math.random() + 1);
			while(C==P || T==C) {
				C = (int)(3*Math.random()+1);
			}
			
			if(A==C) {win2++;}
			else { lose2++;}
			
			System.out.println("");
			
		}
		
		System.out.println("바꾸지 않고 성공한횟수 : "+ win);
		System.out.println("바꾸지 않고 실패한횟수 : "+ lose);
		System.out.println("바꾸고 성공한횟수 : "+ win2);
		System.out.println("바꾸고 실패한횟수 : "+ lose2);
		
	}
}
