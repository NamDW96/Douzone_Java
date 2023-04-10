import java.io.File;

/*
 파일, 폴더를 다루는 클래스 학습
 C# : 파일(File), 폴더(Directory) - c#은 구분함
 
 JAVA : File(파일, 폴더) - File 클래스 하나로 파일생성, 삭제 + 폴더 생성, 삭제 가능
 		- 하나의 클래스로 전부
 >> 예시) a.txt 생성, 수정, 삭제, 정보 read
 >> Temp 생성, 수정, 삭제, 정보 read
 
 경로 
 절대경로 : C:\\ , D:\\   >> C:\\Temp\\a.txt ... 
 상대경로 : 현재 파일을 중심으로 >> ../ >> /
  
 */


public class Ex07_File {
	public static void main(String[] args) {
		String path="C:\\Temp\\file.txt"; //절대경로
		
		File f = new File(path);
		
		//File클래스는 다양한 정보 취득
		System.out.println("파일의 존재여부 확인(파일or폴더) : " + f.exists()); 
		System.out.println("너 폴더니 : " + f.isDirectory()); //폴더인지 파일인지 확인
		System.out.println("너 파일이니 : " + f.isFile());
		
		System.out.println("파일명 : " + f.getName()); //전체 경로에서 파일명만 출력
		
		System.out.println("절대경로 : " + f.getAbsolutePath());
		
		System.out.println("파일 크기 :" + f.length()+ "byte");
		System.out.println("부모경로 : " + f.getParent());
		
	}
}
