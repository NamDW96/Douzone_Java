package kr.or.kosa.dz;

public class Book{
	private String bookNum;
	private String bookName;
	private int bookPrice;
	
	public Book(String bookNum, String bookName, int bookPrice) {
		this.setBookNum(bookNum);
		this.setBookName(bookName);
		this.setBookPrice(bookPrice);
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
}
