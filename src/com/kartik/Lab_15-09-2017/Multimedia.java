public class Multimedia extends Item {
	
	int length;
	String type;
	
	public Multimedia(int ID, String title, int length, String type) {
	
		super(ID, title);
		this.length = length;
		this.type = type;
		
	}
	
	public int getID() {
		
		return super.getID();
		
	}
	
	public String getTitle() {
	
		return super.getTitle();
		
	}
	
	public int getLength() {
		
		return length;
		
	}
	
	public String getType() {
		
		return type;
		
	}
	
	public void setLength(int length) {
	
		this.length = length;
		
	}
	
	public void setType(String type) {
	
		this.type = type;
		
	}
	
	public void setTitle(String title) {
	
		super.setTitle(title);
		
	}
	
	public void display() {
	
		System.out.println("\nID: " + getID() + "\nTitle: " + getTitle() + "\nType: " + type + "\nLength(in seconds): " + length);
		
	}
	
	
}
