import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

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

public class Ex07_Generic_Product {
	public static void main(String[] args) {
		
		//1. Array 사용해서 객체 생성
		// KtTv, Audio, NoteBook을 담을 수 있는 Cart 만드세여
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		//(정적배열의)단점 : 배열의 크기가 고정
		
		//2. ArrayList 를 사용해서 Cart를 만드세요
		List<Product> pcart = new ArrayList<>();
		pcart.add(new KtTv());
		
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		//동적으로 추가, 삭제
		for(Product product : pcart) {
			System.out.println(product);
			//toString 으로 재정의 했기 때문에 주소값이 나오지 않음.
		}
		
		
		//Emp
		//3. ArrayList를 사용해서 사원 3명 만들기
		
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp(1,"김씨","IT"));
		emp.add(new Emp(2,"박씨","수박"));
		emp.add(new Emp(3,"이씨","케잌"));
		
		
		//3.1 사원의 정보를 toStirng() 사용하지 말고 사번, 이름, 직종을 출력하세여~
		//개선된 for문으로
		for(Emp emplist : emp) {
			System.out.println(emplist.getEmpno() + "/" +emplist.getEname()+ "/"+ emplist.getJob());
		}
		
		//3.2 일반 for문으로 출력
		for(int i=0; i<emp.size(); i++) {
			System.out.println(emp.get(i).getEmpno());
		}
		
		//ArrayList 사용해ㅓ 사원 3명 만드세여 (CopyEmp)
		// CompyEmp(100, "김씨", 1000)
		// CompyEmp(200, "이씨", 2000)
		// CompyEmp(300, "박씨", 3000)
		
		List<CopyEmp> cemp = new ArrayList<>();
		cemp.add(new CopyEmp(100, "김씨", 1000));
		cemp.add(new CopyEmp(200, "이씨", 2000));
		cemp.add(new CopyEmp(300, "박씨", 3000));
		
		//4.1 200번 사원의 급여를 6000으로 수정 (일반for문을 통해서) getter, setter
		for(int i=0; i<cemp.size(); i++) {
			if(cemp.get(i).getEmpno() ==200) {
				cemp.get(i).setsal(6000);
				System.out.println(cemp.get(i).toString());
			}
		}
			
		//4.2 300번 사원의 이름을 박씨에서 궁금해씨 수정해서 그 결과를 출력 (개선된 for문)
		for(CopyEmp copyemp : cemp) {
			if(copyemp.getEmpno() ==300) {
				copyemp.setEname("이상해씨");
				System.out.println(copyemp.toString());
			}
		}
		
	}
}
