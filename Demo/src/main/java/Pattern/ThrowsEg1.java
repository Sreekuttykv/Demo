package Pattern;


//unchecked exception
public class ThrowsEg1 {
	
	public static void M()throws ArrayIndexOutOfBoundsException
	{
		throw new ArrayIndexOutOfBoundsException();
	}

	public static void main(String[] args) {
		
		ThrowsEg1.M();

		
	}

}
