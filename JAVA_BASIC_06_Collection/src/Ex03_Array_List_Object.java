import java.util.ArrayList;

import kr.or.kosa.Emp;

/*
목숨과 같은거 - 객체배열





 
 
*/



public class Ex03_Array_List_Object {
	public static void main(String[] args) {
		
		//1. 사원 1명을 만드세요
		Emp emp = new Emp(1000, "김유신","장군");
		System.out.println(emp.toString());
		
		//2. 사원 2명을 만드세요 (Array)
		Emp[] emplist = {new Emp(100,"김씨","영업"), new Emp(200,"박씨","IT")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		System.out.println("");
		
		//3. ArrayList 사용해서
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100,"김씨","영업"));
		elist.add(new Emp(200,"박씨","IT"));
		elist.add(new Emp(300,"이씨","영업"));
		
		//추가될경우
		elist.add(new Emp(300,"최씨","보험"));
		for (int i =0; i<elist.size(); i++) {
			//System.out.println(elist.get(i).toString());
			System.out.println(elist.get(i));
		}
		
		//toString() 사용하지 말고 3명의 사원 정보를 출력하세요
		//hint) getter 를 사용하세요
		//ArrayList는 내부적으로 데이터를 Object[] ...관리 - 데이터를 넣는것은 쉽지만, 뺴는것이 어려움..
		
		for (int i =0; i<elist.size(); i++) {
			Object obj = elist.get(i);
			//System.out.println(obj); //재정의된 toString()
			//obj.getEmpno() -불가 / 부모타입의 참조변수는 자식타입의 자원에 접근하지 못한다(재정의 제외)
			//그럼 어카니? => 자식타입으로 casting
			Emp e = (Emp)obj;    //다운캐스팅
			System.out.println(e.getEmpno() +"/ " + e.getEname() + "/ " + e.getJob());
		}
		// 현업 개발자 (Object >> 필요 >>Downcsating >> 자식접근 
		// Object를 쓰지말자 ... 대신에
		// 타입을 강제 (그 타입을 쓰게 하자) >> 데이터의 관리는 하나의 타입으로 >>타입은 필요시에 사용
		// Generic (제너릭)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		for(Emp e : list2) {
			System.out.println(e.getEmpno());
		}
		
		
	}
}
