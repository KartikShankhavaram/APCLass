import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		String age;
		String address, name, gender;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name(if you don't want to enter name, leave it blank):");
		name = in.nextLine();
		System.out.print("Enter address(if you don't want to enter address, leave it blank):");
		address = in.nextLine();
		System.out.print("Enter age(if you don't want to enter age, leave it blank):");
		age = in.nextLine();
		System.out.print("Enter gender(if you don't want to enter gender, leave it blank):");
		gender = in.nextLine();
		Customer customer1 = new Customer(name, address, age, gender);
		customer1.display();
		Customer customer2 = new Customer("ghar", "home house", "10", "male");
		customer2.display();
			
	}
	
}
