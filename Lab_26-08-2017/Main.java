import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		String name, branch;
		int day, month, year;
		char collegeYear;
		
		Scanner in = new Scanner(System.in);
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
		
		}
		
}
		
