package kr.or.kosa;

//한건의 데이터를 담을 수 있는 클래스
//데이터베이스의 테이블 1:1 매핑 하는 클래스 
// create table emp( empno number , ename varchar2(30)); >> 1건의 데이터를
// select * from emp where empno = 7902
// DTO, VO, DOMAIN

public class CopyEmp {
	private int empno;
	private String ename;
	private int sal;
	

	public CopyEmp(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getsal() {
		return sal;
	}


	public void setsal(int sal) {
		this.sal = sal;
	}

	
	@Override
	public String toString() {
		return "[사번=" + empno + ", 이름=" + ename + ", 직종=" + sal + "]";
	}
	
	
}
