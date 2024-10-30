package interfaceEx;

public class Class implements SampleInterface{
	public void display()
	{
		System.out.println("Implementation of first abstract method and the min value is"+MIN_VALUE);
	}
	public void print()
	{
		System.out.println("Implementation of second abstract method and the max value is: "+MAX_VALUE);
	}

	public static void main(String[] args) {
		SampleInterface obj=new Class();
		obj.display();
		obj.print();
		
	}

}
