import java.io.File;
import java.nio.file.Path;

public class Ex13_Dos {

	public static void main(String[] args) {

		{
			String path="C:\\Temp\\Test";
			
			File f = new File(path);
			f.mkdir();
			
		}

	}
}
