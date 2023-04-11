import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
보조 스트림
DataOutputStream
DataInputStream

장점 : Java가 지원하는 8가지 기본타입별로 write , read 가능
단, 조건이 있다 >> DataOutputStream으로 write 했다면, DataInputStream 으로만 read한다

----------------------------------------------------------
성적.txt
100,90,60,50
50,55,30,100
Line 단위 read >> split >> 타입변환 >> 정수형 Array >> read 연산

규칙을 잘 정의해야된다
그래서 보조스트림쓴다.
----------------------------------------------------------


*/


public class Ex13_DataOutputStream {
	public static void main(String[] args) {
		int[] score= {100,60,55,95,50};
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try {
				fos = new FileOutputStream("score.txt");
				dos = new DataOutputStream(fos);
				for (int i=0; i<score.length; i++) {
					dos.writeInt(score[i]); //정수값 그대로 rite
					//조건 : Byte write 
					//파일은 DataInputsream 통해서만 read 가능
					//
					//dos.writeUTF(null);
				}
		}catch(Exception e){
			e.printStackTrace(); //필수!!
		}finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2){
				e2.printStackTrace();
			}
		}
	}
}
