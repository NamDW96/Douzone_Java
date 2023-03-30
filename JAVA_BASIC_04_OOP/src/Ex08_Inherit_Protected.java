import kr.or.kosa.Pclass;

/*
 접근자 - private default(같은폴더) public
 상속관계에서 protected
 
 protected 양면성 >> default, public 
 >> 상속이 없는 클래스 안에서 protected >> default 동일
 >> 결국 상속관계에서만 의미를 가짐 >> public
 
 */

class Dcalss{
	public int i;
	private int p;
	int s; 				//default
	protected int k;	//default와 동일(상속관계가 없을때) - 상속이 아니면 사용하지 않음.
}

class Child2 extends Pclass{ //상속
	void method() {
		this.k =100; // 상속관계에서 >> 자식은 부모의 protected 자원을 사용가능(public)
		System.out.println(this.k);
		
		//m(); 상속관계내부에서는 protected 접근자를 가진 함수 사용가능. 
	}

	@Override
	protected void m() {
		// TODO Auto-generated method stub
		super.m();
	}
	
	
	//protected 진정한 의미 : 재정의를 했으면 좋겠는데..>> 재정의를 해야 사용이 가능
	
	
}


public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Pclass pclass = new Pclass();
		//pclass.i -kr.or.kosa 내부의 Pclass에서 public 으로 선언한 변수만 참조 가능
		
		Child2 ch2 = new Child2();
		
		
		//ch2.m() 불가능
	}
}
