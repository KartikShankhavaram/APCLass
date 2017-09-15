abstract class Item {
	
	private int ID;
	private String title;
	
	protected Item(int ID, String title) {
	
		this.ID = ID;
		this.title = title;
		
	}
	
	protected int getID() {
		
		return ID;
		
	}
	
	protected String getTitle() {
	
		return title;
		
	}
	
	protected void setID(int ID) {
	
		this.ID = ID;
		
	}
	
	protected void setTitle(String title) {
		
		this.title = title;
		
	}
	
	abstract protected void display();
	
}
