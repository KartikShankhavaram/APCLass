
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex complexNumber = new MyComplex(5d, 0);
		MyComplex complexNumber1 = new MyComplex(5d, 6d);
		MyComplex complexNumber2 = new MyComplex(5d, 6d);
		MyComplex complexNumber3 = new MyComplex(3d, 4d);
		
		System.out.println(complexNumber.isReal()); //true
		System.out.println(complexNumber.isImaginary()); //false
		System.out.println(complexNumber1.equals(5d, 6d)); //true
		System.out.println(complexNumber2.equals(complexNumber1)); //true
		System.out.println(complexNumber2.equals(complexNumber3)); //false
		System.out.println("Magnitude of complexnumber3 is : " + complexNumber3.magnitude());
		System.out.println("Complex conjugate of complex number 2 is :" + complexNumber2.conjugate().real+ "+ i" + complexNumber2.conjugate().imaginary);
		System.out.println(complexNumber2.add(complexNumber3));
		System.out.println(complexNumber2.subtract(complexNumber3));
		System.out.println(complexNumber2.multiplyWith(complexNumber3)); 
		System.out.println(complexNumber2.divideBy(complexNumber3));
	}

}
