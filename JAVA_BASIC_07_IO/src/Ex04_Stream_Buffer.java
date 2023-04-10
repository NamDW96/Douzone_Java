import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
(File 처리 대상) >> DISK >> 입출력의 단위가 한 byte씩 
 
 여러명의 학생을 한명씩 목적지로 보내느 것이 아니고 
 여러명이 탈 수 있는 버스를 대여해서 한번에 보내고 처리 ...
 
 버스 : Buffer
 1. I/O 성능 개선 (접근횟수를 줄임)
 2. Line 단위 (엔터)
 
 Buffer는 독자적인 행동이 불가능 
 
 BufferedOutputStream (보조 스트림) >> 독자적인 작업이 불가 >> File(input,output)Stream - (주 스트림)필요
 */
public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); // 파일이 없으면 create
			bos = new BufferedOutputStream(fos); //버퍼 탄생
			
			for (int i=0; i<10; i++) {
				bos.write('A'); //data.txt 에...
			}
			//bos.flush();
			/*
			 JAVA Buffer (8k , 8192Byte)
			 1. Buffer 안에 내용이 채워지면 스스로 출발 ->(버퍼를 비우는 작업)
			 2. 강제로 출발 (buffer) 강제 비우기 : flush() or / close()하면 자동 flush()
			 3. 개발 close() 자원해제  >> 내부적으로 flush()			
			 */
		} catch (Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
