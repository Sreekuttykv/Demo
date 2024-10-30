package Pattern;

public class Sample {
	
	public static void sum(int a,int b,float c)
	{
		diff(5,2);
		float s=a+b+c;
		System.out.println("Sum:"+s);	
	}
	public static void diff(int a,int b)
	{
		//display();
		int s=a-b;
		System.out.println("Difference:"+s);	
	}
	public void display()
	{
		diff(5,2);
		print();
		System.out.println("it is an instance method");
	}
	
	public String print()
	{
		
		return "hii"+"78";
	}
	
	
	

	
	public static void main(String[] args) {
		
		sum(2,4,5.7f);
		Sample s=new Sample();
		s.display();
		
		System.out.println(s.print());
		//or 
		String s1=s.print();
		System.out.println(s1);
		
		
		
		

	}

}
