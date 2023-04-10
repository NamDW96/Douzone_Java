import java.io.File;

/*
 
*/
public class Ex10_File_SubList {
	
	
	static void printFileList(File dir) {
		
		
	}
	public static void main(String[] args) {
		
	
		if (args.length != 1) {
			System.out.println("사용법 : java [실행할 파일명] [경로명]");
			System.out.println("예시  :  java Ex10_Files_SubList C:\\Temp");
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);

		}
		
		//정상적인 경로 그리고 폴더 있구나 ...
		printFileList(f);
	}
}
