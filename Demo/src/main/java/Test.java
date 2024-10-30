
public class Test {
	static int a=9;
	public  static void dis()
	{	
		//this.m();
		System.out.println("m");

	}
	public Test(int a)
	{
		this.a=a;
		System.out.println(a);
		this.dis();

	}
	public static void main(String[] args) {
		Test t=new Test(10);
		Test t1=new Test(10);
	}

}
