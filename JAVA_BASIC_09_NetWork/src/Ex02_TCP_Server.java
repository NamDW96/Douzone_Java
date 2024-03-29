import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 TCP 서버 
 현재 실행되고 있는 process(서버) 와 process(클라이언트) 연결
 
 서버 : 192.168.0.115
 포트 : 9999
 */
public class Ex02_TCP_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9909);
		System.out.println("접속 대기중 ...");
		Socket socket =	serversocket.accept(); //클라이언트 요청이 오면 (접속)
		System.out.println("연결 완료"); //socket 과 socket 연결
		
		//연결
		//서버 : 클라이언트 (read , write) -> socket과 socket이 TCP를 통해서 통신...
		//socket(input, output stream 내장)
		
		OutputStream out  = socket.getOutputStream();
		DataOutputStream dos = new  DataOutputStream(out);
		dos.writeUTF("동우 ... 문자데이터 Byte 통신입니다.");
		
		System.out.println("서버 종료");
		
		dos.close();
		out.close();
		socket.close();
		serversocket.close();
	}
}
