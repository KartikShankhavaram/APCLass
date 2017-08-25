public class Employee {
	
	int ID;
	String name;
	String dept;
	String email;
	
	Employee(int ID, String name) {
		
		this.name = name;
		this.ID = ID;
		dept = null;
		email = null;
		
	}
	
	public int getID() {
		
		return ID;
		
	}
	
	public String getName() {
	
		return name;
		
	}
	
	public void setDept(String dept) {
		
		this.dept = dept;
		
	}
	
	public String getDept() {
		
		return dept;
			
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	
	}
	
	public void displayInformation() {
		
		String info = "\nID: " + ID + "\nName: " + name + "\nDepartment: " + dept + "\nEmail: " + email;
		
		System.out.println(info);
		
	}
	
}  
