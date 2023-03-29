import java.util.Scanner;

public class Lotto {
	private Scanner scanner;
	public Lotto() {
		scanner = new Scanner(System.in);
	}
	
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 당첨 예상 번호 추출하기**");
		System.out.println("**2. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 :");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	
	
	
}
