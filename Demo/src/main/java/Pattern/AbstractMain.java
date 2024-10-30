package Pattern;

public class AbstractMain extends AbstractClass{
	
	public void display()
	{
		System.out.println("Implementation of abstract method");
	}
	

	public static void main(String[] args) {
		
		AbstractMain a=new AbstractMain();
		a.display();
		a.show();
		
		
		
	}

}
