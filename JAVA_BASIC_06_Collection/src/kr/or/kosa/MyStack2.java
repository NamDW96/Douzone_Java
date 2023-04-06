package kr.or.kosa;
//JAVA API 제공하는 stack 직접 구현해보기
//LIFO 구조를 코드 ....
//1. stack 저장공간 (Array : 고정배열 10개방), 저장공간 타입 (Object)
//2. 위치정보 : 저장되는 값이 있는 위치 (index) hint)전자제품 매장 cart 사용해서 처리 
//3. 기능 : push() , pop() , boolean empty() ,boolean full()
public class MyStack2 {
	private Object[] stackarr; //저장소
	private int top; //배열의 index값 (위치정보)
	private int maxsize; //최대크기  //length
	
	public MyStack2(int maxsize) {
		this.stackarr  =new Object[maxsize];
		this.top = -1;
		this.maxsize = maxsize;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isfull() {
		return (top == this.maxsize -1); // [0][1][2][3][4]  >> 5개
	}
	
	public void push(Object i) {
		if(isfull()) {
			//throw new IndexOutOfBoundsException("예외발생");
			System.out.println("mystack full ....");
		}else {
			this.stackarr[++top]= i; // this.stackarr[0]  , this.stackarr[1]
		}
		
	}
	
	public Object pop() {
		Object value = null;
		if(isEmpty()) {
			System.out.println("mystack empty");
		}else {
			value = this.stackarr[top];
			top--;
		}
		
		return value;
	}
}

