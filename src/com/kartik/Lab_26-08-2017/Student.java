<<<<<<< HEAD
public class Student {
	
	static int ID = 0;
	String name;
	char year;
	String branch;
	Date dateOfBirth;
	
	Student(String name, String branch) {
		
		this.name = name;
		year = 0;
		this.branch = branch;
		dateOfBirth = new Date();
		
	}
	
	static {
		ID++;
	}
	
	public int getID() {
		
		return ID;
		
	}
	
	public String getName() {
	
		return name;
		
	}
	
	public void setYear(char year) {
		
		this.year = year;
		
	}
	
	public char getYear() {
		
		if(year != 0) 
			return year;
		else
			return 'N';
			
	}
	
	public String getBranch() {
		
		return branch;
	
	}
	
	public void setDOB(int day, int month, int year) {
		
		dateOfBirth.setDate(day, month, year);
		
	} 
	
	public String getDOB(char separator) {
		
		String date = dateOfBirth.day + "" + separator + "" + dateOfBirth.month + "" + separator + "" + dateOfBirth.year;
		return date;
		
	}
	
	public void displayInformation() {
		
		String info = "\nID: " + ID + "\nName: " + name + "\nYear: " + year + "\nBranch: " + branch + "\nDate of Birth: " + getDOB('/');
		
		System.out.println(info);
		
	}
	
}  
=======
public class Student {
	
	static int ID;
	String name;
	char year;
	String branch;
	Date dateOfBirth;
	
	Student(String name, String branch) {
		
		this.name = name;
		year = 0;
		this.branch = branch;
		dateOfBirth = new Date();
		
	}
	
	static {
		ID++;
	}
	
	public int getID() {
		
		return ID;
		
	}
	
	public String getName() {
	
		return name;
		
	}
	
	public void setYear(char year) {
		
		this.year = year;
		
	}
	
	public char getYear() {
		
		if(year != 0) 
			return year;
		else
			return 'N';
			
	}
	
	public String getBranch() {
		
		return branch;
	
	}
	
	public void setDOB(int day, int month, int year) {
		
		dateOfBirth.setDate(day, month, year);
		
	} 
	
	public String getDOB(char separator) {
		
		String date = dateOfBirth.day + "" + separator + "" + dateOfBirth.month + "" + separator + "" + dateOfBirth.year;
		return date;
		
	}
	
	public void displayInformation() {
		
		String info = "\nID: " + ID + "\nName: " + name + "\nYear: " + year + "\nBranch: " + branch + "\nDate of Birth: " + getDOB('/');
		
		System.out.println(info);
		
	}
	
}  
>>>>>>> eb06c36e14c839533dde0cddcd065b6de2f0fb1c
