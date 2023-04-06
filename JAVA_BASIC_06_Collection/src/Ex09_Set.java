import java.util.HashSet;

/*
Set 인터페이스
(원안에 들어가세요) : 순서를 보장하지 않는다. 중복을 허락하지 않는다.
순서가없고 중복을 허락하지 않는 데이터 집합  - ex) 로또?..
구현하는 클래스
HashSet, TreeSet(자료구조)

 
 
 
 */
public class Ex09_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("정상 : " +  bo);
		
		
		bo= hs.add(1);
		System.out.println("결과 : " + bo); //false 나오면 같은 데이터가 이미 존재하는 것을 말함
		
		System.out.println(hs.toString());
		
		//로또, 차량번호, 회원id ....
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("C");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("H");
		hs2.add("D");
		hs2.add("G");
		hs2.add("P");
		System.out.println(hs2.toString()); // [P, A, b, C, D, F, G, H, Z] - 중복값이 나오지않고, 순서대로 나오지도 않음.
		
		String[] strobj = {"A","b","C","D","B","A"}; //10000건
		HashSet<String> hs3 = new HashSet<>();
		for(int i=0; i<strobj.length; i++)
		{
			hs3.add(strobj[i]); // 중복데이터는 add 하지 앟는다
		}
		System.out.println(hs3.toString());
		
		
		/*
		for (int i = 0; i < lot0.length; i++) {
			lot0[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lot0[i] == lot0[j]) {
					i--;
					break;
				}
			}
		}
		*/
		
		
		HashSet<Integer> lotto = new HashSet<>();
		//Set set2 = new HashSet();
		while(lotto.size()<6) {
			lotto.add((int)((Math.random() * 45) + 1));
		}
		System.out.println(lotto.toString());
		
		
		
		
	}
}
