
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTriangle();
	}
	
	
	public static void TestTriangle(){
		Point v1 = new Point(0, 0);
		Point v2 = new Point(1, 1);
		Point v3 = new Point(0, 1);
		Triangle triangle = new Triangle(v1, v2, v3);
		triangle.writeToString();
		System.out.println(triangle.printType());
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getArea());
	}
}
