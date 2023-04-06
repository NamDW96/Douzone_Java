import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
Collection FrameWork
>> 다수의 데이터를 다루는 표준화된 방법을 학습 >> 표준화된 방법(인터페이스와 클래스로 구현)
>> 수 많은 인터페이스를 가지고 있다 (다수의 데이터를 효율적으로 다루기 위한)

Iterator 인터페이스 
나열된 자원에 대해서 순차적으로 접근해서 값의 유무를 판단하고 값을 리턴하는 표준을 정의
추상자원을 가지고 있다 >> 어떤 클래스는 Iterator 인터페이스 구현해서 >> 표준화된 접근 방법을 제공

Iterator 인터페이스 가지고 있는 추상자원
hasNext(), Next(), remove() << 추상자원

ArrayList implements Iterator { 3개의 함수를 재정의 하고 있다 }
>>ArrayList 는 표준화된 접근을 제공한다

 

  
  

*/
public class Ex08_Collection_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		//Collection FrameWork 제공하는 표준화된 접근 방식
		Iterator it = list.iterator(); //호출하면 함수안에서 인터페이스를 구현하는 객체가 생성되고 그 주소를 리턴한다.
		//Iterator()를 사용하면 자원을 Iterator 인터페이스가 구현하고 있는 함수를 통해서 제어 가능.
		while(it.hasNext()) { //현업에서 권장 why?(표준화된 출력)
			System.out.println(it.next());
		}
		
		ArrayList<Integer> intlist = new ArrayList<>(); // 원시타입 int에 대한 클래스 Integer -> ArrayList에는 원시타입이 들어갈 수 없다?
		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		//인터페이스 generic 명시
		//Iterator it2 = intlist.iterator(); (x)
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next()); //방향은 순방향 (앞에서부터(-1) 부터 ++)
		}
		System.out.println("********");
		
		//아래는 역방향으로
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		/////////////////////////////////////////////
		// Iterator 순방향 출력
		// 역방향 조회
		ListIterator<Integer> it3 = intlist.listIterator();
		
		//순방향으로 갔다가 역방향으로 감 (점프 불가능)
		//순방향
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		//역방향
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
		//참고
		while(it3.hasNext()) {
			int i = it3.next();
			if(i == 3) {
				it3.remove();
			}
		}
		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIII");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println(numbers);
		
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int num = itr.next();
			if(num % 2 == 0 ) {
				itr.remove();
			}
		}
		System.out.println(numbers);
		
		
	}
}
