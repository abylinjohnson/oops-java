import java.util.Scanner;
public class Employee {
	private int id;
	private String empname;
	private String designations;
	private String departmentname;
	private int salary;
	
	//constructor 
	Employee(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ID of the Employee");
		this.id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the name of the Employee:");
		this.empname = in.nextLine();
		System.out.println("Enter the Designation: ");
		this.designations = in.nextLine();
		System.out.println("Enter the Department: ");
		this.departmentname = in.nextLine();
		System.out.println("Enter the Salary:");
		this.salary = in.nextInt();
	}
	//Parameterized Constructor
	Employee(int id, String empname, String designations, String departmentname, int salary)
	{
		this.id = id;
		this.empname = empname;
		this.designations = designations;
		this.departmentname = departmentname;
		this.salary = salary;
	}
	//setter method
	void setId(int id) 
	{
		this.id = id;
	}
	void setEmpname(String empname)
	{
		this.empname = empname;
	}
	void setDesignation(String designations)
	{
		this.designations = designations;
	}
	void setDepartment(String departmentname)
	{
		this.departmentname = departmentname;
	}
	void setSalary(int salary)
	{
		this.salary = salary;
	}
	//getter methods
	int getId() {
		return id;
	}
	String getEmpname() {
		return empname;
	}
	String getDesignations() {
		return designations;
	}
	String getDepartmentname() {
		return departmentname;
	}
	int getSalary() {
		return salary;
	}
	
}
