import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

class QuizInfo2 {
	String question;
	int answer;
	String result;

	public QuizInfo2(String question, int answer, String result) {
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

	public String toString() {
		return "문제:" + this.question + "입력한 답:" + this.answer + " 결과:" + this.result;
	}
}

class Timeout extends Thread{
	@Override
	public void run() {
		for(int i = 10 ; i > 0 ; i-- ) {
			try {
				  System.out.println("남은 시간 : " + i);
				  Thread.sleep(1000); //휴게실 가서 1초 쉬었다가 경함 (점유) >> runnable 상태
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		Ex06_MultiThread_GuGuDan.inputcheck = true;
		System.out.println("시간 종료");
	}
}

class WordGame extends Thread{
	int answer;
	@Override
	public void run() {
		HashMap<String, Integer> gugudan = new HashMap<String, Integer>();

		for (int i = 0; i < 5; i++) {
			int num1 = (int) (Math.random() * 9) + 1;
			int num2 = (int) (Math.random() * 9) + 1;
			gugudan.put(num1 + "*" + num2, num1 * num2);
		}
		
		Ex06_MultiThread_GuGuDan.totalQuizCount = gugudan.size();
		
		Set keys = gugudan.keySet();
		Object[] keylist = keys.toArray();
		answer = 0;
		for (int i = 0; i < keylist.length; i++) {
			answer = Integer.parseInt(JOptionPane.showInputDialog((String) keylist[i]));
			
			if(Ex06_MultiThread_GuGuDan.inputcheck) break;
			//시간이 종료되면 구구단게임 종료 ....
			
			if (gugudan.get(keylist[i]) == answer) {
				System.out.println("당신은 정답");

				Ex06_MultiThread_GuGuDan.QuizUserInfo2.add(new QuizInfo2((String) keylist[i], answer, "O"));
			} else {
				System.out.println("당신은 오답");
				Ex06_MultiThread_GuGuDan.QuizUserInfo2.add(new QuizInfo2((String) keylist[i], answer, "X"));
			}
		}
		
	}
}

public class Ex06_MultiThread_GuGuDan {
	
	static boolean inputcheck = false;
	static List<QuizInfo2> QuizUserInfo2 = new ArrayList<>();
	static int totalQuizCount = 0;
	
	
	public static void main(String[] args) {
		
		Timeout timeout = new Timeout();
		WordGame wordgame = new WordGame();
		
		timeout.start();
		wordgame.start();
		
		try {
			timeout.join();
			wordgame.join();
			//join을 걸었기 때문에 main thread 가장 늦게 종료된다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("총 문제수 " + totalQuizCount + "푼 문제수" + QuizUserInfo2.size());
		for(int i=0; i<QuizUserInfo2.size(); i++) {
			System.out.println(QuizUserInfo2.get(i).toString());
		}
	}

}