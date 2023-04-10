import java.io.File;

public class Ex08_File_Dir {
	public static void main(String[] args) {
		// 메인함수의 parameter
		// 1. prompt 창에서 parameter로 받기
		// 2. Run -run configuration - Main class 맞추고 argument에서 값 입력
		// System.out.println(args[0]); //프로그램 시작전에 어떤 값을 넣고싶을때 사용
		// 파일이 시작될 때 같이 받고 싶을때
		// 그냥 나와서 하는것 실제로 사용률은 낮음
		
		if (args.length != 1) { // 방법을 ..
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0);
		}
		
		//java Ex08_File_Dir C:\\Temp
		
		File f = new File(args[0]); // File("C:\\Temp")
		if(!f.exists() || !f.isDirectory()) {
			// 존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않은 경로입니다");
			System.exit(0);
		}
		
		//실제 존재하는 경로이고 그 경로가 폴더라면
		//POINT
		File[] files = f.listFiles();
		//[GGGGBBBB][1.jpg][a.txt][new.txt][file.txt] 실제 나의 C:\\Temp 경로에 있는 파일,폴더 
		//System.out.println(files.length); //폴더 및 파일의 개수
		
		for(int i=0; i<files.length; i++) {
			String name = files[i].getName(); //파일명 or 폴더명
			System.out.println(files[i].isDirectory()? "[Dir]" + name : name);
		}
		
	}
}
