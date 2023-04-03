import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 ☆★☆★ 존나 중요함 ☆★☆★
 Today Point(ArrayList)
 
 // List 인터페이스를 구현하고 있는 클래스 >> ArrayList >> 순서보장(index), 중복데이터 허용)
 // 식당 번호표, 은행 번호표 (같은 데이터가 있어도 상관없다 - 순서가있으니)
 
 
*/
public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList(); //ctrl + shift +o -필요한 클래스 호출
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0; i <arraylist.size(); i++) {
			System.out.println(arraylist.get(i)); //get 함수 외워!
		}
		System.out.println(arraylist.toString()); //익숙해 지면 toString 사용
		
		//add 함수는 데이터를 순차적으로 넣는다.
		arraylist.add(400); // index 3 인 방에 들어감
		arraylist.add(0, 1111); 
		System.out.println("0번째 방에 1111추가 : "+ arraylist.toString());
		// 0번째 방에 1111 추가 :[1111, 100, 200, 300, 400]
		// 1. 비순차적인 데이터 추가, 삭제 >> 성능이 좋지 않다. >> 순서가 있는 데이터 집합
		// 2. 순차적인 데이터 추가, 삭제 에 유리하다.
		
		// [1111, 100, 200, 300, 400]
		
		System.out.println(arraylist.contains(200)); //배열안에 값이 있는지 확인 - true, false
		System.out.println(arraylist.size());
		System.out.println(arraylist.contains(20000)); // false
		arraylist.clear(); //데이터를 삭제한다 -> size 값이 0으로 바뀐다. -> capacity(용량은 남아있다.)
		System.out.println(arraylist.size());
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //비어있니? false
		System.out.println(arraylist.size());
		
		//[101][102][103]
		Object value = arraylist.remove(0); //0번째 방 - 101 삭제 
		System.out.println(arraylist.toString()); //[102][103]
		
		//POINT 다형성
		//인터페이스 부모 타입
		//다형성(확장성, 유연성)
		
		//ArrayList arraylist = new ArrayList(); << 이렇게 사용하는 것 보다는 
		//습관적으로 다형성 코드를 사용하자!
		List li = new ArrayList();
		//부모타입의 참조변수 li는 자식객체의 주소값을 가질 수 있다. (다형성)
		//인터페이스는 구현코드가 없어요... 재정의 ... 자식의 함수가 실행(^오^)
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		System.out.println(li.toString());
		
		List li2 = li.subList(0, 2); //내부적으로 List 인터페이스 ...코드
		System.out.println(li2);
		
		// ArrayList >> Array
		// 정렬 
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString()); //[50, 1, 7, 40, 46, 3, 15]
		
		Collections.sort(alist); //낮은 값부터 정렬
		System.out.println(alist.toString());  //[1, 3, 7, 15, 40, 46, 50]
		
		Collections.reverse(alist); //배열을 역으로 정렬
		System.out.println(alist.toString());
		//초급 .. 코드 직접 작성
		
	}
}
