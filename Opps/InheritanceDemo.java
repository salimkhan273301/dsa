package Opps;
class A{
	int i;
	int j;
	public A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	void show()
	{
		System.out.println("Sum="+(i+j));
	}
}
class B extends A{
	int k;
	

	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	public B(int i, int j) {
		super(i, j);
		
	}

	void show1()
	{
		System.out.println("Sum="+(i+j+k));
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		B e=new B(1,2,3);
		A e1=new A(4,6);
		B e3=new B(10,20);
		e1.show();
		e.show1();
		e3.show();
		

	}

}
