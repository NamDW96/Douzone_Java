import java.util.StringTokenizer;

public class Ex06_String_Method {
	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("elo"); //순서에 맞는 문자열을 갖고 있는가
		System.out.println(bo);
		
		boolean bo1 = str.contains("ello");
		System.out.println(bo1);
		
		String str2 = "a b c d";//[a][ ][b][ ][c][ ][d]
		System.out.println(str2.length());
		
		String filename ="hello java world";
		System.out.println(filename.indexOf("h"));    //문자의 첨자(index)위치
		System.out.println(filename.indexOf("java")); //해당 단어가 시작되는 index
		System.out.println(filename.indexOf("요"));   //해당 문자가 없을경우 -1 
		// 값이 없으면 -1 리턴 / 리턴 ... 배열에 원하는 단어가 없다
		// 신문사설 검색 . 내가 원하는 단어가 있는지를 ...확인
		if(filename.indexOf("wo")!= -1) {
			System.out.println("wo 단어가 하나라도 있다.");
		}
		
		System.out.println(filename.lastIndexOf("a")); //뒤에 나오는 a의 index
		
		//무조건 알아야 하는것. 
		//length(), indexOf(), substring(), replace(), split() 암기.
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman
		System.out.println(result.substring(1)); // subStirng-시작 index
		System.out.println(result.substring(1,2)); //u
		//beginIndex the beginning index, inclusive.
		//endIndex the ending index, exclusive. (index -1)
		System.out.println(result.substring(0,1));
		System.out.println(result.substring(0,0));//(0,-1)
		
		//Quiz
		String filename2 ="home.jpg"; //또는 h.jpeg , aaaaa.hwp 올 수 있다.
		//여기서 파일명과 확장자를 분리해서 출력
		// 파일명 : home
		// 확장자 : jpg
		// 단 위에서 배운 함수만 사용해서
		System.out.println(filename2.substring(0,filename2.indexOf(".")));
		System.out.println(filename2.substring(filename2.indexOf(".")+1));
		String filename3 ="homeplus.jpeg";
		splitfilename(filename3);
		
		//replace
		String str3 = "ABCDADDDDDDDDA";
		String result3 = str3.replace("DDDD","G");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(3));
		System.out.println(str3.charAt(1));
		System.out.println(str3.endsWith("DDDA")); //끝나는 문자와의 일치여부 확인 boolean
		System.out.println(str3.equalsIgnoreCase("aBCDaDDDDDDDDA")); //대소문자 구별 없이 비교
		
		//Today Point
		
		String str4="슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearray = str4.split(",");
		for(String s : namearray) {
			System.out.println(s);
		}
		
		//정규표현식 일단 내일(03/29)
		
		//참고..
		String str6="a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6, "/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//넌센스 
		String str7 = "홍       길            동";
		//저장 >> 공백제거 >> "홍길동"
		System.out.println(str7.replace(" ","")); //홍길동
		
		String str8 = "          홍길동         ";
		System.out.println(">"+str8+"<");
		System.out.println(">"+str8.trim()+"<");
		
		String str9="      홍 동       동          ";
		
		//bad choice
		String result5 = str8.trim();
		result5 = result5.replace(" ", "");
		System.out.println(result5);
		
		//여러개의 함수를 연결해서 (method chain)
		System.out.println(str9.replace(" ",""));
		System.out.println(str9.replace(" ","").trim());
		System.out.println(str9.replace(" ","").trim().substring(2));
		
		//hint
		int sum=0;
		String[] numarr = {"1","2","3","4"};
		for(String s : numarr) {
			sum+= Integer.parseInt(s);
		}
		System.out.println("sum : "+sum); //10
		
		String jumin="123456-1234567";
//		int dot = jumin.indexOf("-");
//		String before=jumin.substring(0,dot);
//		String after=jumin.substring(dot+1);
//		String sum13 = before +after;
//		System.out.println(sum13);
//		for(String s : sum13) {
//			sum+= Integer.parseInt(s);
//		}
		
		int sum14 =0;
		for(int i=0; i<13; i++) {
			sum14 +=Integer.parseInt(String.valueOf(splitfilename2(jumin).charAt(i)));
		}
		System.out.println("답 : "+sum14);
		
	}
	
	// '파일이름.확장자' => 파일이름과 확장자 따로 출력
	public static void splitfilename(String filename) {
		int dot = filename.indexOf(".");
		System.out.println(filename.substring(0,dot));
		System.out.println(filename.substring(dot+1));
	}
	
	public static  String splitfilename2(String filename) {
		int dot = filename.indexOf("-");
		String b = filename.substring(0,dot);
		String a = filename.substring(dot+1);
		//String a = filename.substring(filename.indexOf("-")+1);
		return a+b;
	}
}
