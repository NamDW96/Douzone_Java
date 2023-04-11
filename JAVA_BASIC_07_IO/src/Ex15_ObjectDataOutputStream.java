import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

/*
파일을 기반으로 작업
파일에 객체를 write (직렬화 방식으로)


*/
public class Ex15_ObjectDataOutputStream { //보조스트림으로 볼 수 있다.
	public static void main(String[] args) {
		String filename="UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;
		
		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			//직렬화
			//파일 write 직렬화 ...
			out = new ObjectOutputStream(bos);
			
			//객체 생성
			UserInfo u1 = new UserInfo("홍길동","super",100);
			UserInfo u2 = new UserInfo("박길동","tiger",50);
			
			//직렬화
			out.writeObject(u1); //UserInfo 객체를 줄을 세워서 write
			out.writeObject(u2);
			//직렬화 끝
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
				System.out.println("파일 생성 -> buffer -> 직렬화 -> 파일 write");
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
