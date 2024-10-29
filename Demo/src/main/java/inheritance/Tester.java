package inheritance;

public class Tester extends Employee {

	int salary=40000;
	public void show()
	{
		System.out.println("child class method");
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
		Tester obj=new Tester();
		obj.display();
		obj.show();
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
		
		

	}

}
