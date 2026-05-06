package Day8;

class Employee{
	int age=21;
	String name="Sneha";
	double salary=25000.37;
}

public class test {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.salary);
	}

}