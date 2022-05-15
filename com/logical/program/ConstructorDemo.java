package com.logical.program;
class A
{
	int a;
	int b;
	int result;
	public A(int a)
	{
		this.a=a;
		System.out.println("one arg  const----");
	}
public A()
{
	System.out.println("defalt const----");
}
public	A(int a,int b)
	{
	System.out.println("Two arg cons----");
	this.a=a;
	this.b=b;
	
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		A obj=new A();
System.out.println(obj.a);
System.out.println(obj.b);
	}

}
