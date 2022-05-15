package Opps;

public class EmployeeDemo {
	int empid;
	String empname;
	double empsalry;
	

	public EmployeeDemo(int empid, String empname, double empsalry) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalry = empsalry;
	}
//		public void input(int empid, String empname, double empsalry) {
//			
//			this.empid = empid;
//			this.empname = empname;
//			this.empsalry = empsalry;
//	}
	void show()
	{
		System.out.println("EmpId:"+empid);
		System.out.println("EmpName:"+empname);
		System.out.println("EmpSalry:"+empsalry);
	}
	


	public static void main(String[] args) {
		EmployeeDemo e=new EmployeeDemo(1,"salim",20000);
		EmployeeDemo e1=new EmployeeDemo(2,"Hasan",40000);
		//input(10,"sajid",30000);
		e.show();
		e1.show();
		

	}

}
