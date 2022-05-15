package Opps;

import java.util.Scanner;

public class User {

	public static void main(String[] args){
	
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("=====MENU=======");
		}
		Employee emp=new Employee();
		System.out.println("enter Id:");
		int id=sc.nextInt();sc.nextLine();
		System.out.println("enter Name:");
		String name=sc.nextLine();
		System.out.println("enter Address:");
		String add=sc.nextLine();
		System.out.println("enter Number:");
		String num=sc.nextLine();
		System.out.println("enter Salary:");
		String sal=sc.nextLine();
		emp.setEmpid(id);
		emp.setEmpname(name);
		emp.setEmpaddress(add);
		emp.setEmpno(num);
		emp.setEmpsalry(sal);
	}
		
public void addEmp(Employee emp) {
	

}

}
