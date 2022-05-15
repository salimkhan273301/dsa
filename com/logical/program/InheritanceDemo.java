package com.logical.program;
class B
{
	int a=10;
	int b=11;
	int c;
	public void show()
	{
		System.out.println(a);
	}
	public void show1(int b)
	{
		this.b=12;
		System.out.println(b);
		System.out.println(c);
	}
	public void show1(int a ,int c)
	{
		this.a=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
	B obj=new B();
	B obj1=new B();
	B obj3=new B();
	obj.show1(1,2);

	}

}
