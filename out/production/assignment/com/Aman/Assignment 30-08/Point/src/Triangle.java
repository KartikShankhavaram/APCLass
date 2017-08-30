/**
 * 
 */

/**
 * @author 16ucs027
 *
 */
public class Triangle {
	private Point v1 = new Point();
	private Point v2 = new Point();
	private Point v3 = new Point();
	
	public Triangle(Point point1, Point point2, Point point3){
		this.v1 = point1;
		this.v2 = point2;
		this.v3 = point3;
	}
	
	public Triangle(double x1, double y1,double x2,double y2,double x3,double y3){
		this.v1.setXY(x1, y1);
		this.v2.setXY(x2, y2);
		this.v3.setXY(x3, y3);
	}
	
	public void writeToString() {
		System.out.println("Triangle " +  "v1 =" + v1.convertToString() +  "v2 =" + v2.convertToString() +  "v3 =" + v3.convertToString());
	}
	
	public double getPerimeter(){
		return (this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1));
	}
	
	
	public String printType(){
		double d1 = this.v1.distance(v2);
		double d2 = this.v2.distance(v3);
		double d3 = this.v3.distance(v1);
		if(d1==d2){
			if(d2==d3)
				return "Equilateral";
			else
				return "Isosceles";
		}else if (d2==d3){
			if(d1==d3)
				return "Equilateral";
			else
				return "Isosceles";
		}else{
			if(d1==d3){
				return "Isosceles";
			}
			return "Scalene";
		}
	}
	public double getArea(){
		double d1 = this.v1.distance(v2);
		double d2 = this.v2.distance(v3);
		double d3 = this.v3.distance(v1);
		double s = this.getPerimeter()/2;
		double area = 0;
		area = Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
		return area;
	}
}













