
public class Ex07_Array_Lotto_Quiz {
	public static void main(String[] args) {
		int[] lot = new int[6];
		// 1~45 사이의 난수 출력
		for(int i=0; i<lot.length; i++) {
			lot[i] = (int)((Math.random()*45)+1);
			// 중복값 검증
			for(int j=0; j<lot.length; j++) {	
			if(i!=j) {
				while(lot[i]==lot[j]) {
					lot[i] = (int)((Math.random()*45)+1);
					}
				}
			}
			
			/*
			 for (int j=0; j<i; j++){   //i=0, j=0; 일 때, j<i의 조건을 만족하지 못하므로 for문을 실행하지 않는다.
			 	if(lotto[i] == lotto[j]){
			 		i--;
			 		break;
			 	}
			 }
			 */
			
		}
		//낮은 순으로 정렬
		int temp = 0;
		for(int i=0; i<lot.length-1; i++) {
			for (int j=i+1; j<lot.length; j++) {
				if(lot[i]>lot[j]) {
					temp = lot[i];
					lot[i] = lot[j];
					lot[j] = temp;
				}
			}
		}
		//출력
		System.out.print("당첨번호는 : ");
		for(int arr : lot) {
			System.out.print(arr+" ");
		}

	}
}
