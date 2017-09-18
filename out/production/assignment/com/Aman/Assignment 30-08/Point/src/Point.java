
public class Point {
	
	private double x;
	private double y;
	
	public Point(){
		this.x = 0;
		this.y =0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void setXY(Point another){
		this.x = another.x;
		this.y = another.y;
	}
	
	public void setXY(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public Point getXY(){
		Point point = new Point(this.x, this.y);
		return point;
	}
	
	public String convertToString(){
		return " (" + this.x + ", " + this.y + ") ";
	}
	
	public double distance(double x, double y){
		double distance = 0;
		distance = Math.sqrt((Math.pow(this.x-x,2)+ Math.pow(this.y-y, 2)));
		return distance;
	}
	
	public double distance(Point another){
		double distance = 0;
		distance = Math.sqrt((Math.pow(this.x-another.x,2)+ Math.pow(this.y-another.y, 2)));
		return distance;
	}
}




















