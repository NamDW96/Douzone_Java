class Product{
	int price;
	int bonuspoint;
	String name;
	
	Product(int price){ //제품의 공통특징
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
	Product(String name,int price){ //제품의 공통특징
		this.name = name;
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
		
		
	}
	
	public String toString() {
		return this.name;
	}
	
}



class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
	
}

class Audio extends Product{
	Audio(){
		super(1000);
	}
	@Override
	public String toString() {
		return "Audio";
	}
	
}

class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}
class Mouse extends Product{
	Mouse(){
		super(200);
	}
	@Override
	public String toString() {
		return "Mouse";
	}
	
}






//구매자
class Buyer{
	int money = 5000;
	int bonuspoint;
	
	//기능 구매기능
	//제품을 구매할 수 있는 기능 (3개 구매가능)
	//내 잔액 - 제품의 가격 , 포인트 갱신 +
	
	void kttvBuy(KtTv n) {//함수의 parameter 로 제품객체를 받아서 (가격, 포인트)
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다.^^;"+this.money);
			return; 	//함수의 강제종료
		}
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매하신 물건은 : "+n.toString());
		System.out.println("현재 잔액은 : "+this.money);
	}
	
	void audioBuy(Audio n) {//함수의 parameter 로 제품객체를 받아서 (가격, 포인트)
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다.^^;"+this.money);
			return; 	//함수의 강제종료
		}
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매하신 물건은 : "+n.toString());
		System.out.println("현재 잔액은 : "+this.money);
	}
	
	void noteBookBuy(NoteBook n) {//함수의 parameter 로 제품객체를 받아서 (가격, 포인트)
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다.^^;"+this.money);
			return; 	//함수의 강제종료
		}
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매하신 물건은 : "+n.toString());
		System.out.println("현재 잔액은 : "+this.money);
	}
	
	
	
	void Buy(Product n) {//함수의 parameter 로 제품객체를 받아서 (가격, 포인트)
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다.^^;"+this.money);
			return; 	//함수의 강제종료
		}
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매하신 물건은 : "+n.toString());
		System.out.println("현재 잔액은 : "+this.money);
	}
	
	
	
	
	
	
}


/*
1차 오픈 ...

매장에 제품 더 구매 1000개 제품 추가 (마우스, 청소기 etc...) ..POS (자동 등록:제품)
매장에 1000개의 제품 전시 ....
업체 전단지 주말 오픈세일을 알림 ....

1. 오픈 3개 구매 >> 997제품 구매가 안되요
>> 팀장 >> 하와이 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 2일동안 구매함수 997개 추가



 
 
*/



public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		//오픈 시뮬레이션
		Product pt = new Product("QQQ", 500);
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		Mouse mouse = new Mouse();
		
		Buyer buyer = new Buyer();
		System.out.println(kt);
//		buyer.kttvBuy(kt);
//		buyer.kttvBuy(kt);
//		buyer.kttvBuy(kt);
//		buyer.kttvBuy(kt);
//		buyer.kttvBuy(kt);
//		buyer.audioBuy(audio);
//		buyer.audioBuy(audio);
//		buyer.audioBuy(audio);
//		buyer.noteBookBuy(notebook);
//		buyer.noteBookBuy(notebook);
//		buyer.noteBookBuy(notebook);
		buyer.Buy(mouse);
		buyer.Buy(pt);
		
	}
}
