package Pattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("pattern2");
	

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		
		System.out.println();
		System.out.println("pattern3");
	
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+++" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond Pattern");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
			
			
		}
		
		
		System.out.println();
		System.out.println("Diamond Pattern 2");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
			
			
		}
	}

}
