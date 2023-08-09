import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/*
java api 는 네트워크 작업을 지원하기 위해서 ....
java.net .... 다양한 클래스 제공

1. 크로스 도메인 오류 (java 코드 처리 : read)
2. 크롤링 (특정 페이지 원하는 정보 추출)

샘플) https://qi-b.qoo10cdn.com/goods_image/5/2/6/3/356775263o.jpg
*/
public class Ex01_URLConnection {
	public static void main(String[] args) throws Exception {
		String urlstr = "https://ssl.pstatic.net/melona/libs/1460/1460810/030a15639698966b4058_20230731133115811.png";
		
		URL url = new URL(urlstr); //연결 (인터상에 주소)
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		
		URLConnection uc = url.openConnection();
		
		// URLConnection 연결된 주소에서 원하는 추출하기
		int filesize = uc.getContentLength();
		
		System.out.println("파일 크기 : " + filesize);
		System.out.println("파일형식 : " + uc.getContentType());
		
		// read 복제 ....
		FileOutputStream fos = new FileOutputStream("copyimage2.jpg"); 
		//파일 생성(빈) , 프로젝트 폴더 default 경로
		
		byte[] buffer = new byte[2048];
		int n = 0;
		int count =0;
		while((n = bis.read(buffer)) != -1) {
			//fos.write(buffer,0,buffer.length);
			fos.write(buffer,0,n);
			fos.flush();
			System.out.println("n : " + n);
			count+=1; // while 반복 횟수
		}

		System.out.println("count : " + count);
		fos.close();
		bis.close();
		

	}

}
