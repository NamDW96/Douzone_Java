package kr.or.kosa.dz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	HashMap<String, Book> book = new HashMap<>();
	int bookCount =0;
	
	public void Run() {
		
		
		int choice =-1;
		while(choice!=0) {
			System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");
			choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
			case 1: addBook();    break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: listBook();   break;
			case 5: listISBN();   break;
			case 0: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다."); 
			}
		}
	}
	
	public void addBook() {
		System.out.println("추가할 도서");
		String str = sc.nextLine();
		System.out.println("도서 제목");
		String title = sc.nextLine();
		System.out.println("가격");
		int price = Integer.parseInt(sc.nextLine());
		book.put(str, new Book(str, title, price));
		System.out.printf("ISBN:%s 이름:%s 가격:%d 생성하였습니다.\n",str,title,price);
		bookCount++;
	}
	
	public void deleteBook() {
		if(bookCount==0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			System.out.println("삭제할 도서");
			String str = sc.nextLine();
			book.remove("str");
			System.out.println("삭제하였습니다.");
			bookCount--;
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 도서");
		String str = sc.nextLine();
		Book book2 = book.get(str);
		System.out.println("검색결과 : >> " +"ISBN:"+book2.getBookNum() + " 이름:"+ book2.getBookName() +" 가격:"+ book2.getBookPrice());
	}
	
	public void listBook() {
		if(bookCount==0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			System.out.println("도서목록");
			System.out.println("도서 수:" + bookCount);

			Set set = book.entrySet();
			Iterator it = set.iterator();

			for (Map.Entry m : book.entrySet()) {

				System.out.println("ISBN :" + ((Book) m.getValue()).getBookNum() + " 이름:"
						+ ((Book) m.getValue()).getBookName() + "가격 :" + ((Book) m.getValue()).getBookPrice());
			}
		}
	}
	
	public void listISBN() {
		if(bookCount==0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			System.out.println("도서목록");
			System.out.println("도서 수:" + bookCount);

			for (Map.Entry m : book.entrySet()) {

				System.out.println(((Book) m.getValue()).getBookNum());
			}
		}
	}
}
	
