public class Printed extends Item {
	
	int pages;
	String type;
	
	public Printed(int ID, String title, int pages, String type) {
	
		super(ID, title);
		this.pages = pages;
		this.type = type;
		
	}
	
	public int getID() {
		
		return super.getID();
		
	}
	
	public String getTitle() {
	
		return super.getTitle();
		
	}
	
	public int getNumberOfPages() {
		
		return pages;
		
	}
	
	public String getType() {
		
		return type;
		
	}
	
	public void setNumberOfPages(int pages) {
	
		this.pages = pages;
		
	}
	
	public void setType(String type) {
	
		this.type = type;
		
	}
	
	public void setTitle(String title) {
	
		super.setTitle(title);
		
	}
	
	public void display() {
	
		System.out.println("\nID: " + getID() + "\nTitle: " + getTitle() + "\nType: " + type + "\nNumber of Pages " + pages);
		
	}
	
}
