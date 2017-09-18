
public class MyComplex {

	/**
	 * @param args
	 */
	
	double real, imaginary;
	
	public MyComplex(double val1, double val2){
		this.real = val1;
		this.imaginary = val2;
		System.out.println("New complex number is : " + this.real + " + " + this.imaginary +"i");
	}
	
	public boolean isReal(){
		if(imaginary==0){
//			System.out.println("Number is real and real part is : " + real);
			return true;
		}
			 
		else{
//			System.out.println("Nuber's imaginary part is : " + imaginary);
			return false;
		}
	}
	
	public boolean isImaginary(){
		return !isReal();
	}
	
	public boolean equals(double real, double imaginary){
		return (this.real == real && this.imaginary == imaginary);
	}
	
	public boolean equals(MyComplex another){
		return (this.real == another.real && this.imaginary == another.imaginary);
	}
	
	public double magnitude(){
		return Math.sqrt((Math.pow(real,2)+ Math.pow(imaginary, 2)));
	}
	
	public MyComplex conjugate(){
		MyComplex conjugate = new MyComplex(this.real, -this.imaginary);
		return conjugate;
	}
	
	public MyComplex add(MyComplex another){
		MyComplex result = new MyComplex(this.real + another.real, this.imaginary + another.imaginary);
		return result;
	}
	
	public MyComplex subtract(MyComplex another){
		MyComplex result = new MyComplex(this.real - another.real, this.imaginary - another.imaginary);
		return result;
	}
	
	public MyComplex multiplyWith(MyComplex another){
		double realPart = (this.real * another.real) - (this.imaginary * another.imaginary);
		double imaginaryPart = (this.real * another.imaginary) + (this.imaginary * another.real);
		MyComplex result = new MyComplex(realPart, imaginaryPart);
		return result;
	}
	
	public MyComplex divideBy(MyComplex another){
		double realPart = ((this.real * another.real) + (this.imaginary * another.imaginary))/Math.pow(this.magnitude(), 2);
		double imaginaryPart = ((this.imaginary * another.real) -(this.real * another.imaginary))/Math.pow(this.magnitude(),2);
		MyComplex result = new MyComplex(realPart, imaginaryPart);
		return result;
	}
	

}
