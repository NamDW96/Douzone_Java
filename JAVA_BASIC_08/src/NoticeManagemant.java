import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NoticeManagemant {
	Scanner sc = new Scanner(System.in);
	Map<Integer, Notice> noticeList = new HashMap<Integer, Notice>();

	public void noticeFileLoad() {
		File file = new File("noticeFile.txt");
		if (file.length() > 0) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream oos = new ObjectInputStream(fis);

				noticeList = (HashMap) oos.readObject();

				oos.close();
				fis.close();

			} catch (Exception e) {
				System.out.println("공고 파일을 불러오는데 실패하였습니다.");
				e.printStackTrace();
			}
		}
	}
	
	//수정된(?) 파일 저장하기
	public void noticeFileSave() {
		String file = "noticeFile.txt";
		if(noticeList.size()>0) {
			try {
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(noticeList);
				
				oos.close();
				fos.close();
			} catch (Exception e) {
				System.out.println("수정된 파일 저장 과정에서 에러발생");
				e.printStackTrace();
			}
		}
	}
	
	public void applicantInquiry(int noticeNumber) {
		System.out.println("지원자를 조회합니다.");
		
		Notice notice = noticeList.get(noticeNumber);
		
		if (notice.getApplicant() == null ) {
			System.out.println("공고 지원자가 없습니다.");
		} else {
			System.out.print("해당 공고 지원자 : ");
			for (String applicant : notice.getApplicant()) { // 지원자 출력
				System.out.println(applicant + " ");
			}
		}
		
		System.out.println();
	}
	
	public void noticeStatusChange(int noticeNumber) {
		this.noticeList = noticeList;
		Notice notice = noticeList.get(noticeNumber);
		notice.setNoticeStatus();
		noticeFileSave();
	}
	
	public void noticeDeletion(int noticeNumber) {
		noticeList.remove(noticeNumber);
		System.out.println("공고를 삭제했습니다.");
		
	}
	
	public void noticeRegistration(String presidentID) {
		System.out.println("아래의 정보를 입력해주세요.");
		System.out.println("모집인원 : ");
		int recruitmentNumber = Integer.parseInt(sc.nextLine());
		System.out.println("성별 : ");
		String gender = sc.nextLine();
		System.out.println("업체명 : ");
		String companyName = sc.nextLine();
		System.out.println("매장위치 : ");
		String companyLocation = sc.nextLine();
		System.out.println("시급 : ");
		int hourlyWage = Integer.parseInt(sc.nextLine());
		System.out.println("알바시간 : "); 
		int jobHours = Integer.parseInt(sc.nextLine()); 
		System.out.println("기간 : ");
		int period = Integer.parseInt(sc.nextLine());
		Notice notice = new Notice(presidentID, recruitmentNumber, gender, companyName, companyLocation, hourlyWage, jobHours, period);
		this.noticeList.put(notice.getNoticeNumber(), notice);
		noticeFileSave();
		System.out.println("공고가 등록되었습니다.");
		System.out.println();
	}	
	
	public void noticeListCheck(String presidentID) {
		System.out.println("등록한 공고를 확인합니다.");
		noticeFileLoad();
		if (noticeList.size() == 0) {
			System.out.println("등록된 공고가 없습니다.");
		} else {
			System.out.print("등록한 공고 정보 : ");
			for (Entry<Integer, Notice> noticeEntry : noticeList.entrySet()) {
				if (noticeEntry.getValue().getPresidentID().equals(presidentID)) {
					System.out.println(noticeEntry.getValue());
				}
			}
		}
		System.out.println();
	}
	
	public void noticeApplication(String applicantId, int noticeNumber) {
		System.out.print("지원할 공고 번호를 입력해주세요 : ");
		Notice notice = noticeList.get(noticeNumber);
		notice.setApplicant(applicantId);
		noticeFileSave();
		System.out.println();
	}
	
	// 전체 공고 목록 확인
	public void allNoticeListCheck() {
		System.out.println("전체 공고 목록을 확인합니다.");
		for (Entry<Integer, Notice> noticeEntry : noticeList.entrySet()) {
			System.out.println(noticeEntry.getValue());
		}
		System.out.println();
	}
	
	// [지원자] 각 공고 정보 확인 (하나씩)
	public void noticeInfoCheck(int noticeNumber) {
		System.out.println("해당 공고의 정보를 확인합니다.");
		System.out.println(noticeList.get(noticeNumber));
		System.out.println();
	}
	
	// 지원 공고 목록 확인
	public void applicantNoticeListCheck(String applicantId) {
		System.out.println("지원한 공고의 목록을 확인합니다.");
		for (int i=0; i<noticeList.size(); i++) { // 공고 번호 size 까지 돌아간다.
			System.out.println(noticeList.get(applicantId));
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
