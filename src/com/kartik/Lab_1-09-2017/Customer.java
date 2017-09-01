public class Customer {
	
	String name;
	static int number;
	int ID;
	String address;
	String age;
	String gender;
	
	public Customer(String name, String address, String age, String gender) {
	
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		ID = ++number;
		
	}	
	
	/*public Customer(String name) {
	
		this(name, "", 0, ""):
		
	}
	
	public Customer(String address) {
	
		this("", address, 0, ""):
		
	}
	
	public Customer(int age) {
	
		this("", "", age, ""):
		
	}
	
	public Customer(String gender) {
	
		this("", "", 0, gender):
		
	}
	
	public Customer(String name, String address) {
	
		this(name, address, 0, ""):
		
	}
	
	public Customer(String name, int age) {
	
		this(name, "", age, ""):
		
	}
	
	public Customer(String name, String gender) {
	
		this(name, "", 0, gender):
		
	}
	
	public Customer(String address, int age) {
	
		this("", address, age, ""):
		
	}
	
	public Customer(String address, String gender) {
	
		this("", "", 0, ""):
		
	}
	
	public Customer() {
	
		this("", "", 0, ""):
		
	}
	
	public Customer() {
	
		this("", "", 0, ""):
		
	}
	
	public Customer() {
	
		this("", "", 0, ""):
		
	}
	
	public Customer() {
	
		this("", "", 0, ""):
		
	}*/
	
	public void display() {
		
		System.out.println("\nID: " + ID + "\nName: " + name + "\nAddress: " + address + "\nAge: " + age + "\nGender: " + gender);
		
	}
	
}
