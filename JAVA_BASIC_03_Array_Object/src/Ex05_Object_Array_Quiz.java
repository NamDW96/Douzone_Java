import kr.or.kosa.dto.Emp;

public class Ex05_Object_Array_Quiz {
	public static void main(String[] args) {
		/*
		 사원 3명을 만드세요
		 단 Array 사용
		 사원의 정보
		 1. 1000 , 홍길동
		 2. 2000 , 김유신
		 3. 3000 , 유관순
		 
		 
		 */

		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(1000,"홍길동");
		emplist[1] = new Emp(2000,"김유신");
		emplist[2] = new Emp(3000,"유관순");
		
		for(int i=0; i<emplist.length; i++) {
			emplist[i].empInfoPrint();
		}
		
		Emp[] emplist2 = new Emp[] {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		
		Emp[] emplist3 = {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		
		for (Emp emp : emplist2) {
			emp.empInfoPrint();
		}
		
		for (Emp emp : emplist3) {
			emp.empInfoPrint();
		}

		
	}


}

