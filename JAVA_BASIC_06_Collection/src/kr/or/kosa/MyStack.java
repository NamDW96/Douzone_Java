package kr.or.kosa;



public class MyStack {
	
	private Object[] stackarr; //저장소
	private static int lastnum = 0;
	
	public MyStack(int maxsize) {
		this.stackarr = new Object[maxsize];
	}
	
	public boolean isEmpty() {
//		if(lastnum == 0) {
//			return true;
//		}
//		return false;
		return(lastnum ==0);
	}
	
	public boolean full() {
//		if(lastnum == this.stackarr.length) {
//			System.out.println("트루");
//			System.out.println(this.maxsize);
//			return true;
//		}
//		else {
//			return false;
//		}
		return(lastnum == this.stackarr.length);
	}
	
	public void push(Object i) {
		if(full()!=true) {
			this.stackarr[lastnum] = i;
			lastnum ++;
		}
		else {
			System.out.println("Stack full");
		}
	}
	
	public Object pop() {
		if(isEmpty() != true) {
			lastnum --;
			return this.stackarr[lastnum];
		}
		else {
			System.out.println("Stack empty");
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		MyStack arr = new MyStack(10);
		
		arr.push(13);
		arr.push(14);
		arr.push(15);
		arr.push(16);
		arr.push(17);
		arr.push(18);
		arr.push(19);
		arr.push(10);
		arr.push(11);
		arr.push(12);
		arr.push(13);
		
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
	}
}
