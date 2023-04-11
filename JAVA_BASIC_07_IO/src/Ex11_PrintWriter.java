import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
출력 형식을 지정할 수 있는 보조 스트림

출력방법
1.printf
2.String.format
3.I/O계열의 printWriter (파일의 출력을 정의(이쁘게? -줄 맞춰서?))
 
현업 ) 세금계산서, 지출결의서, 휴가서, 품의서 >> 만들어 주는 소프트웨어 (리포팅하는 툴) >> 오즈, 크리스탈 레포트

 
 */
public class Ex11_PrintWriter {
	public static void main(String[] args) {
		
		try {
			//파일에 내용추가
//			PrintWriter  pw = new PrintWriter("C:\\Temp\\homework.txt"); //없으면 생성도 함
//			pw.println("**********************************************");
//			pw.println("**   			  HOMEWORK		  			**");
//			pw.printf("%3s : %5d %5d %5d %5.1f\n","남동우",100,88,90,(float)((100+88+90)/3));
//			pw.println("**********************************************");
//			pw.close();
			
			//read (Line단위) 문자 -> 
			// 생각 문자 -> Reader / 라인단위 -> Buffer
			FileReader fr = new FileReader("C:\\Temp\\homework.txt"); 
			//try 구문안에서 생성했기 때문에 finally를 사용해서 제어할 수 없다
			//전역으로 선언하고 finally 블록에서 사용한 자원을 종료해주는것이 일반적이다.
			BufferedReader br = new BufferedReader(fr);
			String s="";
			while((s = br.readLine()) != null) {
					System.out.println(s);
			}
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
