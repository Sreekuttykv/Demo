package Pattern;

import java.io.IOException;

//checked exception
public class ThrowsEg2 {
	
	public static void M()throws IOException
	{
		throw new IOException();
		
	}

	public static void main(String[] args) {
		
		try {
			ThrowsEg2.M();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
