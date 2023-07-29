
import java.io.FileInputStream;

import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
	public static void main(String[] args) {
		String oriFile = "C:\\Temp\\1.jpg";
		String targetFile = "copy.jpg";
		//default 경로 : C:\Douzon\JAVA\Labs\JAVA_BASIC_07_IO\copy.jpg
		// JAVA+BAISC+07_IO 폴더가 default 경로
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs = new FileInputStream(oriFile);
			fos = new FileOutputStream(targetFile);
			
			int data =0;
			while ((data = fs.read()) != -1) {
				fos.write(data); //byte값
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
