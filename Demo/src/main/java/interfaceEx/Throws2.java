package interfaceEx;

import java.io.IOException;

//checked 
public class Throws2 {
	public static void m()throws IOException
	{
		throw new IOException();
	}

	public static void main(String[] args) throws IOException {
		
		m();
	}

}
