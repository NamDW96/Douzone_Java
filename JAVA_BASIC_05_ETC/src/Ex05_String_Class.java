/*
 String 클래스 (문자를 여러개 담을 수 있는 클래스)
 String 수 많은 함수를 가지고 있다. >> 대부분의 데이터는 문자열 (자르고, 합치고, 나누고 .. 조합)
 String >> 가지고 있는 일반함수 + static 함수 활용 (15~20개)함수공부.....
 
 
 
 
 
 */
public class Ex05_String_Class {
	
	public static void main(String[] args) {
		String str=""; // 초기화
		String[] strarr = {"abc", "bbb","ccc"};
		
		for(String s : strarr) {
			System.out.println(s);
		}
		//(기존 String)사용방법 : int ,double 값타임 처럼 부답없이 사용
		
		String st = "홍길동";
		System.out.println(st.length()); //배열
		//[홍][길][동] >> char[]로 관리
		System.out.println(st); // 실제로는 값 toString() 이 생략되어있다.
		//String 클래스는 Object 부모 클래스를 가지고 있고 toString()
		//상속관계 String extends Object >> 재정의 (override) >>
		//>>주소에 가서 값을 read해서 값을 리턴하도록[toString()]
		
		//정식표기
		String sdata = new String("홍길동"); // String은 클래스 이기 때문에 원본 표기는 이게맞다
		// String st = "홍길동"; 두가지의 차이 비교.
		System.out.println(sdata);
		
		String name ="가나다라마";
		//String 내부적으로 char[] (char배열) member field >> 배열 [가][나][다][라][마]
		//class String extends Object {private char[] str .. setter ...@Override toString()}
		
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열의 비교
		System.out.println(str1); //toString() 생략되어있다.
		System.out.println(str2.toString()); //toString() 재정의 : 주소값이아닌 값이 나오도록
		
		System.out.println(str1 == str2);  // true
		//String은 객체고 str1 과 str2 는 주소값이어야 하는데 왜 true가 나올까?
		// == 연산자는 값을 비교 
		//같은 주소 판명
		//☆★메모리에 실제로 같은 문자열이 있으면 재사용
		//str1과 str2는 같은 메모리를 참조.
		
		//TODAY POINT
		//문자열의 비교는 무조건 .. equals
		System.out.println(str1.equals(str2)); // 주소를 찾아가서 그 안에 있는 값을 비교
		// '==' 값을비교 equals 주소를 찾아가 값을 비교
		
		//why : equals
		String str3 = new String("BBB"); // 이 경우 문자열을(주소를) 새로 만든다
		String str4 = new String("BBB");
		System.out.println(str3 == str4);     //false
		System.out.println(str3.equals(str4));
		//new를 사용하여 생성하지 않은 문자열은 같은 주소값을 가지지만,
		//new를 사용하여 생성된 문자열은 새로운 주소를 가지기 때문에 값을 비교하려면 equals를 써라.
		
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s); // ABC
		s = "A";
		System.out.println(s); // A
		
		//그래서 .. String 누적으로 쓰면 안됀다.
		//그래서 Stringbuilder, Stringbuffer 이런거 쓴데 
	}
}
