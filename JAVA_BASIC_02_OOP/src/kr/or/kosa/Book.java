package kr.or.kosa;

public class Book {
	private int price;
	private String bookName;
	
	public Book(int inputPrice, String inputBookName) {
		price = inputPrice;
		bookName = inputBookName;		
	}
	
	public String getBookname() {
		return bookName;
	}
	public int getPrice() {
		return price;
	}
	public void bookCheck() {
		System.out.printf("책이름 : [%s] 책 가격: [%d]\n ",bookName,price);
	}
	
//	public void nameCheck() {
//		System.out.printf("책이름 : [%s]\n ",bookName);
//	}
//	public void priceCheck() {
//		System.out.printf("책가격 : [%d]\n ",price);
//	}


	public static void main(String[] args) {
		Book book = new Book(9999,"홍길동전");
		
		book.bookCheck();
		System.out.println(book.getBookname());
	}
}