package kr.or.kosa.dto;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	Scanner sc = new Scanner(System.in);
	

	//메뉴 보여주기
	public void menu(String[][] seat) {
		
		System.out.println("********************");
		System.out.println("    영화 예매 시스템   ");
		System.out.println("********************");
		System.out.println("1. 예매하기");
		System.out.println("2. 예매조회");
		System.out.println("3. 예매취소");
		
		int selectNum = Integer.parseInt(sc.nextLine());
		switch(selectNum) {
		case 1 : selectSeat(seat); break;
		case 2 : checkbook(seat); break;
		case 3 : cancelbook(seat); break;
		}
	}
	
	//좌석현황 보여주기
	public void showSeat(String[][] seat) {
		System.out.println("********좌석현황********");
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals((i+1)+"-"+(j+1))){
					System.out.printf("["+seat[i][j]+"]");
				}
				else {
					System.out.printf("[예약]");
				}
					
			}
		System.out.println();
		}
		System.out.println("**********************");
	}
	
	// 1.예매하기
	public void selectSeat(String[][] seat) {
			showSeat(seat);
			System.out.println("좌석을 선택해주세요. 예)1-1");
			String inputSeat = sc.nextLine();
		
			for(int i=0; i<seat.length; i++) {
				for(int j=0; j<seat[i].length; j++) {
					if(seat[i][j].equals(inputSeat)) {
						bookSeat(seat, inputSeat);
						break;
					}
				}
			}
			System.out.println("선택할 수 없는  좌석입니다.");
			menu(seat);
	}
	
	//1.1 예매 의사결정여부 확인
	public void bookSeat(String[][] seat ,String inputSeat) {
		System.out.println("예매 가능합니다. 예매하시겠습니까?");
		System.out.println("네(1) 아니오(2) 초기화면(0)중 하나를 입력해주세요.");
		
		int selectNum = Integer.parseInt(sc.nextLine());
		try {
			switch(selectNum) {
			case 0 : menu(seat); break;
			case 1 : yes(seat,inputSeat); break;
			case 2 : selectSeat(seat);break;
			default : System.out.println("잘못된 입력입니다. 메뉴화면으로 이동합니다.");
					 menu(seat);
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 메뉴화면으로 이동합니다.");
			menu(seat);
		}
		
	}
	
	//예매선택
	public void yes(String[][] seat, String inputSeat) {
		Random r = new Random();
		String ran = Integer.toString(r.nextInt(8) + 1); 
		for (int i = 0; i < 7; i++) { 
			ran += Integer.toString(r.nextInt(9)); 
			}
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals(inputSeat)) {
					seat[i][j]=ran;
				}
			}
		}
		System.out.println("예매가 완료되었습니다.");
		System.out.printf("예매한 좌석번호:[%s] / 예매번호:[%s]",inputSeat,ran);
		System.out.println("감사합니다.");
		menu(seat);
	}
	
	// 2.예매조회
	
	public void checkbook(String[][] seat) {
		System.out.println("예매번호를 입력해주세요");
		String selectNum = sc.nextLine();
		int check=0;
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals(selectNum)) {
					System.out.printf("고객님께서 예매하신 좌석은%s 입니다.\n",(i+1)+"-"+(j+1));
					check++;
				}
			}
		}	
		if(check==0) {
			System.out.println("예매정보를 확인할 수 없습니다.");
		}
		menu(seat);
	}
	
	
	// 3.예매취소
	public void cancelbook(String[][] seat) {
		System.out.println("예매번호를 입력해주세요");
		String selectNum = sc.nextLine();
		int check=0;
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				if(seat[i][j].equals(selectNum)) {
					System.out.println("예매를 취소하시겠습니까?");
					System.out.println("네(1) 아니오(2)중 하나를 입력해주세요");
					int selectNum2 = Integer.parseInt(sc.nextLine());
					switch(selectNum2) {
						case 1: seat[i][j]=(i+1)+"-"+(j+1);
							System.out.println("예매가 취소되었습니다. 감사합니다.");
							check++;
						case 2: break;
					}
				}
			}
		}
		if(check==0) {
			System.out.println("예매정보를 확인할 수 없습니다.");
		}
		
		menu(seat);
	}
}
