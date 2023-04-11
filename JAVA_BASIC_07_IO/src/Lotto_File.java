import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

class Lotto {

	// 로또 생성
	public String makeLotto() {

		Set<Integer> lotto = new TreeSet<>();
		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
		}
		String str = "당첨번호" + lotto.toString() + "\n";
		return str;
	}

	// Write
	public void Write() {
		FileWriter fos = null;
		BufferedWriter bos = null;

		try {
			fos = new FileWriter("Lotto.txt", true); // 파일이 없으면 create
			bos = new BufferedWriter(fos); // 버퍼 탄생

			bos.write(makeLotto());

		} catch (Exception e) {

		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}
	}

	// Read
	public void Read() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("Lotto.txt");
			br = new BufferedReader(fr);
			String line = "";
			for (int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {

			}
		}
	}
}

public class Lotto_File {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		lotto.Write();
		lotto.Read();
	}
}
