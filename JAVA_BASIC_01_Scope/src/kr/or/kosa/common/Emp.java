package kr.or.kosa.common;


//사용자의 데이터를 담는 클래스
//VO,DTO,DMA
//사원 1명의 데이터를 담을 수 있는 클래스

//사원 1명 생성 //Emp emp = new Emp(7788,"홍길동","IT",300);
//emp.getEname(); 호출하면
//홍길동님 데이터 출력
public class Emp {
	private int enpno;
	private String ename;
	private String job;
	private int sal;
	
	public Emp(int empno, String ename, String job, int sal) {
		super();
		this.enpno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public int getEnpno() {
		return enpno;
	}
	public void setEnpno(int enpno) {
		this.enpno = enpno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [enpno=" + enpno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
	
	
}
