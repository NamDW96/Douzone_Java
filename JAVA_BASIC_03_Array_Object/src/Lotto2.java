import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {
	Scanner scanner = new Scanner(System.in);
	
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 당첨 예상 번호 추출하기**");
		System.out.println("**2. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 :");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	public static void main(String[] args) {
	
		Lotto2 lo2 = new Lotto2();
		String game = lo2.showMenu();
		if(game.equals("2")) System.exit(0);
		while (game.equals("1")) {

			int[] lot = new int[6];
			int[] chlot = new int[46];
			int[] chlot2 = new int[46];
			int[] lot0 = new int[6];
			int num1 = 0;
			int loof = 5;

			// 가장 많이 나온 숫자 찾기
			while (loof-- > 0) {
				for (int i = 0; i < lot0.length; i++) {
					lot0[i] = (int) ((Math.random() * 45) + 1);
					for (int j = 0; j < i; j++) {
						if (lot0[i] == lot0[j]) {
							i--;
							break;
						}
					}
				}
				for (int i = 0; i < lot0.length; i++) {
					chlot[lot0[i]]++;
					chlot2[lot0[i]] = lot0[i];
				}
				System.out.println(Arrays.toString(lot0));
				Arrays.fill(lot0, 0);
			}
			System.out.println(Arrays.toString(chlot));
			System.out.println("");
			System.out.println(Arrays.toString(chlot2));

			// 가장 많이 나온 숫자중에서 제일 작은값
			int max = 0;
			for (int i = 1; i < chlot.length; i++) {
				if (chlot[max] < chlot[i]) {
					max = i;
				}
			}

			System.out.println("지난 5회차에서 가장 많이 나온 숫자 : " + max);
			lot[0] = max;

			// 1~45 사이의 난수 출력
			for (int i = 1; i < lot.length; i++) {
				lot[i] = (int) ((Math.random() * 45) + 1);

				for (int j = 1; j < chlot.length; j++) {
					if (lot[i] == chlot2[j]) {
						i--;
						break;
					}
				}

				for (int j = 0; j < i; j++) { // i=0, j=0; 일 때, j<i의 조건을 만족하지 못하므로 for문을 실행하지 않는다.
					if (lot[i] == lot[j] || lot[i] + 1 == lot[j] || lot[i] - 1 == lot[j]) {
						i--;
						break;
					}
				}
			}

			// 낮은 순으로 정렬
			int temp = 0;
			for (int i = 0; i < lot.length - 1; i++) {
				for (int j = i + 1; j < lot.length; j++) {
					if (lot[i] > lot[j]) {
						temp = lot[i];
						lot[i] = lot[j];
						lot[j] = temp;
					}
				}
			}

			// 출력
			for (int i = 0; i < chlot2.length; i++) {
				if (chlot2[i] != 0) {
					System.out.printf("%d ", chlot2[i]);
				}
			}
			System.out.println("");
			System.out.print("당첨번호는 : ");
			for (int arr : lot) {
				System.out.print(arr + " ");
			}
			System.out.println("");
			game = lo2.showMenu();
			if(game.equals("2")) break;
		}
	}
}

