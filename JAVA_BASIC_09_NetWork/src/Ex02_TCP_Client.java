import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트(socket)

//서버 IP, 서버 PORT 

public class Ex02_TCP_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.115",9909);
		System.out.println("서버 연결!");
		
		//서버에서 보낸 메시지 받기
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String servermsg = dis.readUTF();
		System.out.println("서버에서 보낸 메시지 : " + servermsg);
		
		dis.close();
		in.close();
		socket.close();
	}
}
