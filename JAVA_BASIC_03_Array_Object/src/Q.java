import java.util.Arrays;
import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		double[] avg = new double[num];
		
		for(int i=0; i<num; i++) {
			avg[i] = sc.nextDouble();
		}
		
		double cnt = 0.0;
		for(int i=0; i<num-1; i++) {
			for (int j=1; j<num; j++) {
				if(avg[i]>avg[j]) {
					cnt = avg[i];
					avg[i] = avg[j];
					avg[j] = cnt;
				}
			}	
		}
//		Arrays.parallelSort(avg);
		
		double sum = 0.0;
		for(int i=0; i<num; i++) {
			sum += (avg[i]/avg[num-1]*100);
		}
		System.out.println(sum/num);
	
	}
}
