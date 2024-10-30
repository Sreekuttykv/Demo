package interfaceEx;


//unchecked exception
public class Sample {
	
	public static void m()throws ArithmeticException
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		
		m();
	}

}
