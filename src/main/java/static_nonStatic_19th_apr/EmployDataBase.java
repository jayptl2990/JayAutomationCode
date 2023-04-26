package static_nonStatic_19th_apr;

public class EmployDataBase {

	String emp_name;
	String emp_city;
	int emp_age;
	double emp_salary;
	String emp_email;

	static String companyName;
	static String departmentName;

	public static void main(String[] args) {
		display1();
		display2();
		display3();
		EmployDataBase e = new EmployDataBase();
		e.show1();
		e.show2();
		e.show3();
	}

	public static void display1() {
		System.out.println("static 1");

	}

	public static void display2() {
		System.out.println("static 2");

	}

	public static void display3() {
		System.out.println("static 3");
	}

	public void show1() {
		System.out.println("non static 1");
		display1();
	}

	public void show2() {
		System.out.println("non static 2");
		display2();
	}

	public void show3() {
		System.out.println("non static 3");
		display3();

	}

}
