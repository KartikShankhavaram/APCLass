import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		char switch;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Whose information do you want to enter? (e = employee, s = student): ");
		switch = in.next().charAt(0);
		while(switch != 'e' && switch != 's') {
			System.out.print("Enter 'e' or 's': ");
			switch = in.next.charAt(0);
		}
		if(switch == 's') {
			String name, branch;
			int day, month, year;
			char collegeYear;
		
			System.out.print("Enter the following details: ");
			System.out.print("\nEnter name: ");
			name = in.next();
			System.out.print("\nEnter branch: ");
			branch = in.next();
			System.out.print("\nEnter Date of Birth: \nDay: ");
			day = in.nextInt();
			System.out.print("\nMonth: ");
			month = in.nextInt();
			System.out.print("\nYear: ");
			year = in.nextInt();
			System.out.print("\nEnter year in college: ");
			collegeYear = in.next().charAt(0);
		
			Student student = new Student(name, branch);
			student.setYear(collegeYear);
			student.setDOB(day, month, year);
			student.displayInformation();
		
		} else {
			
			String name, dept, email;
			int ID;
		
			System.out.print("Enter the following details: ");
			System.out.print("\nEnter ID: ");
			ID = in.nextInt();
			System.out.print("\nEnter Name: ");
			name = in.next();
			System.out.print("\nEnter Department: ");
			dept = in.next();
			System.out.print("\nEnter Email: ");
			email = in.next();
		
			Employee employee = new Employee(ID, name);
			employee.setDept(dept);
			employee.seEmail(email);
			employee.displayInformation();
		
		
		
		}
		
		
		
	}
		
}
		
