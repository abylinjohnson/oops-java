import java.util.Scanner;

public class College {
	public static void main(String args[]) {
		int num, flag = 0, flag2 = 0, sw, sw2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Employees:");
		num = in.nextInt();
		Employee[] list = new Employee[num];
		for (int i = 0; i < num; i++) {
			list[i] = new Employee();
		}

		while (flag != 1) {
			System.out.println("Enter 1 to Search Employee By ID.");
			System.out.println("Enter 2 to Edit Employee By ID.");
			System.out.println("Enter 3 to Print All Details.");
			System.out.println("Enter 0 to Quit");
			sw = in.nextInt();

			switch (sw) {
			case 0:
				System.out.println("Good Bye!");
				flag = 1;
				break;
			case 1:
				System.out.println("Enter the Employee ID:");
				int search_id = in.nextInt();
				for (int i = 0; i < num; i++) {
					if (list[i].getId() == search_id) {
						System.out.println("***********");
						System.out.println("Match Found");
						System.out.println("***********");
						System.out.println("ID: " + list[i].getId());
						System.out.println("Name: " + list[i].getEmpname());
						System.out.println("Designation: " + list[i].getDesignations());
						System.out.println("Department: " + list[i].getDepartmentname());
						System.out.println("Salary: " + list[i].getSalary());
						System.out.println("***********");
						break;
					} else if (list[i].getId() != search_id && i == num - 1) {
						System.out.println("Match Not Found!");
					}
				}
				break;
			case 2:
				System.out.println("Enter the Employee ID:");
				int edit_id = in.nextInt();
				int loc = -1;
				for (int i = 0; i < num; i++) {
					if (edit_id == list[i].getId())
						loc = i;
				}
				if (loc == -1) {
					System.out.println("Invalid ID!");
					break;
				}
				flag2 = 0;
				while (flag2 != 1) {
					System.out.println("Enter 1 to Edit Name.");
					System.out.println("Enter 2 to Edit Designation.");
					System.out.println("Enter 3 to Edit Department.");
					System.out.println("Enter 4 To Edit Salary.");
					System.out.println("Enter 0 to Quit");
					sw2 = in.nextInt();
					in.nextLine();
					switch (sw2) {
					case 0:
						flag2 = 1;
						break;
					case 1:
						System.out.println("The Current Name is:" + list[loc].getEmpname());
						System.out.println("Enter the New Name:");
						String newName = in.nextLine();
						list[loc].setEmpname(newName);
						break;
					case 2:
						System.out.println("The Current Designation is:" + list[loc].getDesignations());
						System.out.println("Enter the New Designtion:");
						list[loc].setDesignation(in.nextLine());
						break;
					case 3:
						System.out.println("The Current Department is:" + list[loc].getDepartmentname());
						System.out.println("Enter the New Department:");
						list[loc].setDepartment(in.nextLine());
						break;
					case 4:
						System.out.println("The Current Salary is:" + list[loc].getSalary());
						System.out.println("Enter the New Salary:");
						list[loc].setSalary(in.nextInt());
						break;

					}
					System.out.println("*************");
					System.out.println("After Editing");
					System.out.println("*************");
					System.out.println("ID: " + list[loc].getId());
					System.out.println("Name: " + list[loc].getEmpname());
					System.out.println("Designation: " + list[loc].getDesignations());
					System.out.println("Department: " + list[loc].getDepartmentname());
					System.out.println("Salary: " + list[loc].getSalary());
					System.out.println("*************");
					
					
				}
				break;
			case 3:
				for(int i=0;i<num;i++) {
					System.out.println("***********");
					System.out.println("ID: " + list[i].getId());
					System.out.println("Name: " + list[i].getEmpname());
					System.out.println("Designation: " + list[i].getDesignations());
					System.out.println("Department: " + list[i].getDepartmentname());
					System.out.println("Salary: " + list[i].getSalary());
					System.out.println("***********");
				}

			}
		}
	}
}
