package java_learn;


public class Test{
	public static void main(String[] args) {
		Employee p1 = new Employee();
		Employee p2 = new Employee("jsb", 50000, 40);
		p1.tell();
		p2.tell();
	}
}


class Employee{
	String name;
	double Salary;
	int age;
	
	public Employee() {
		this.name = "fault";
		this.Salary = 0;
		this.age = 0;
	}
	
	public Employee(String a, double s, int y) {
		this.name = a;
		this.Salary = s;
		this.age = y;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void tell() {
		System.out.println("名字
