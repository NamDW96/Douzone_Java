import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		//파일 score.txt 학샘 점수 기록
		//목적 : read해서 학생 점수 합계 / 평균 구하기
		
		int sum=0;
		int score=0;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt(); //Ex13 에서 writeInt()로 작성
				System.out.println("score int 파일 : " + score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("sum의 결과 : " + sum);
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
