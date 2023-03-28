import java.util.Arrays;

public class Bubble_Sort {

	public static void bubble_sort(int[] data) {
		bubble_sort(data, data.length);
	}
	
	private static void bubble_sort(int[] data , int datalength) {
		
		
		for(int i = 1 ; i < datalength ; i++) {
			for(int j = 0 ; j < datalength - i; j++) {
				if(data[j] > data[j+1]) {
					swap(data, j, j+1);
				}
			}
		}
		
	}
	private static void swap(int[] data , int i , int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	public static void main(String[] args) {
		int[] data = {7,3,2,8,9,4,6,1,5};
		System.out.println(Arrays.toString(data));
		bubble_sort(data);
		System.out.println(Arrays.toString(data));

	}

}
