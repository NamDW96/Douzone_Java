import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<k,v> 
 
HashMap<String,String>
HashMap<Integer,String>
HashMap<String,Student> POINT
 
 put("kglim", new Student());
 
 */

class ArrayTest{
	ArrayList<String[]> al = new ArrayList<>();
}

class Student{
	int kor;
	int math;
	int eng;
	String name;

	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	
}


public class Ex13_Map_Generic {
	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		
		//실무에서 Map
		//학생의 성적 데이터
		//key(학번) , value[국어,영어,수학] >> Array, Collection(ArrayList)
		
		HashMap<String, Student> smap = new HashMap<>();
		smap.put("hong", new Student(100, 90, 50, "홍길동"));
		smap.put("kim", new Student(10, 9, 5, "김유신"));
		
		Student sd = smap.get("kim");
		System.out.println(sd.kor + " / "+ sd.eng +" / "+ sd.math + " / " + sd.name);
		
		ArrayTest at = new ArrayTest();
		String[] strarr = {"A","B","C"};
		at.al.add(strarr);
		
		//Tip
		Set set =smap.entrySet(); // Map (key,value) 가공 >> key+"="+value
		//set은 중복을 허락하지 않는다.
		Iterator it = set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		/*
		 hong=Student@626b2d4a
		 kim=Student@5e91993f
		 */
		
		//Tip
		//key, value
		// class Entry {Object key, Object value}
		// Map {Entry[] elements} >> Map.Entry
		for(Map.Entry m : smap.entrySet()) {
			//System.out.println(m.getKey() + " / "+ m.getValue());
			System.out.println(m.getKey() + " / "+ ((Student)m.getValue()).name);
		}
	}
}
