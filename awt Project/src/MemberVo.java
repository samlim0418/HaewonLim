
public class MemberVo {//Á¶È¸ 
	private String empno;
	private String ename;
	private String job;
	private int sal;
	

	public MemberVo() {

	}

	public MemberVo(String empno, String ename, String job, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
 		this.sal = sal;
	}

	public String getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public int getSal() {
		return sal;
	}
}
