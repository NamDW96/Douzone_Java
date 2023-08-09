
class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 자동 저장 ....");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				break;
			}
			save();
		}
	}
}


public class Ex09_DaemonThread {
	
	public static void main(String[] args) {
		AutoSaveThread autosavethread = new AutoSaveThread();
		autosavethread.setDaemon(true); //autosavethread 데몬 ....
		autosavethread.start();
		//main thread 종료 .... 데몬도 종료 
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("메인 스레드 종료");
	}
}
