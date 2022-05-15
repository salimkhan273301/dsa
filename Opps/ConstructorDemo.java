package Opps;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstructorDemo {
	int id;
	String name;
	String address;
	
	

	public ConstructorDemo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public ConstructorDemo() {
		this.id=1;
		this.name="salim";
		this.address="pipra";
	}
	void Show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		
	}
	



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ConstructorDemo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
	ConstructorDemo e=new ConstructorDemo(1,"A","pipra");
	System.out.println("Enter Id, Name, Address:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();sc.nextLine();
	String b=sc.nextLine();
	String c=sc.nextLine();
	e.setId(a);
	e.setAddress(c);
	e.setName(b);
	ArrayList<Object> list=new ArrayList<>();
	list.add(e);
	System.out.println(list);

	}

}
