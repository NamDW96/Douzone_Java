import javax.swing.JOptionPane;

/*
 게임
 
 문제 ....
 시간 ....
 2개의 작업 동시에(경합) >> cpu 점유할 수 있는 상태 
 
 기존의 단일 Thread 불가능 (stack 1개)
 multi Thread 를 통해서 (stack 여러개 만들어서 )
 
*/

class WordTime extends Thread {
	@Override
	public void run() {
		for(int i = 10 ; i > 0 ; i-- ) {
			
			if(Ex04_Multi_Word_Game.inputcheck) return; //함수 탈출  //Thread 종료
			try {
				  System.out.println("남은 시간 : " + i);
				  Thread.sleep(1000); //휴게실 가서 1초 쉬었다가 경함 (점유) >> runnable 상태
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class WordInputThread extends Thread {
	@Override
	public void run() {
		String dan = "2";
		String inputdata = JOptionPane.showInputDialog(dan + "단 값을 입력하세요");
		if(inputdata != null && !inputdata.equals("")) {
			Ex04_Multi_Word_Game.inputcheck = true;
		}
		System.out.println("입력값 : " + inputdata);
	}
}


public class Ex04_Multi_Word_Game {
	
	static boolean inputcheck = false; // 유무를 판단 .....
	
	public static void main(String[] args) {
		WordTime timerThread = new WordTime();
		timerThread.start();  // stack 만들고 .... run() 올려 놓는다 ... start() end
		
		WordInputThread wordinputthread = new WordInputThread();
		wordinputthread.start();
		
		//상태 (일시정지) >> 실행되고 있는 스레드를 휴게실로 보내기 sleep(),join(),wait()
		
		//위성과 지구와의 거리
		//목성(T), 토성(T), 금성(T)  >> 총 거리의 합 > main Thread 3개의 종료 후에 ... 
		
		//main thread 는 word, time 이끝난 다음에 종료하고 싶어요
		
		try {
			timerThread.join(); //main 에게 내가 끝날때까지 기다려달라고 요청
			wordinputthread.join(); //Thread 는 기본적으로 다른 프로그램과 동시에 실행되지만 join을 걸면 main이 종료되는걸 기다림
		} catch (Exception e) {
			
		}
		
		System.out.println("MAIN END"); //다른 Thread 끝난 다음에 처리 
		// 여기서 최종값을 확인하거나 .. 처리
	}

}

/*
문제
main 함수 제외한 Thread 2개 생성
1. 시간(time) 제어하는 Thread
2. 단어 입력을 처리하는 Thread

main 함수 2개 실행

단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
hint) 공유자원 (static)
Thread : 상태정보 
*/

