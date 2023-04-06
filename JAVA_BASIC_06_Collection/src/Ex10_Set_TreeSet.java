import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {
	public static void main(String[] args) {
		//set : 순서(X), 중복(X)
		
		/*
		 TreeSet 순서x, 중복x, 정려기능(0) 
		 검색하거나 정렬 필요할 경우 사용하는 자료구조
		 로또 >> 
		 
		 이진트리 :  root > leaf
		 데이터 저장시 정렬기능 제공
		 */
		
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		System.out.println(hs.toString()); 
		//[P, A, B, D, F, G, K] 순서를 유지하지 않는다. 중복데이터 없다
		
		Set<Integer> lotto = new TreeSet<>();
		for(int i=0; lotto.size() <6
				; i++) {
			int num = (int)(Math.random()*45+1);
			lotto.add(num);
			System.out.println("num : "+num);
		}
		System.out.println(lotto.toString());
		// [2, 6, 21, 28, 41, 43] 정렬기능을 가지고있어, 검색과 정렬에 유리하다
	}
}
