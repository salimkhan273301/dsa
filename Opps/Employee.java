package Opps;

public class Employee {
	private int empid;
	private String empname;
	private String empaddress;
	private String empno;
	private String empsalry;
	public Employee(int empid, String empname, String empaddress, String empno, String empsalry) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empno = empno;
		this.empsalry = empsalry;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEmpsalry() {
		return empsalry;
	}
	public void setEmpsalry(String empsalry) {
		this.empsalry = empsalry;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empno=" + empno
				+ ", empsalry=" + empsalry + "]";
	}
	
	

	

}
