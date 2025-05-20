package clases;

public class TrianguloRectangulo {
	private double a;
	private double b;
	private double c;
	
	public TrianguloRectangulo() {
		a = 1;
		b = 1;
		this.c=hipotenusa();
	}
	public TrianguloRectangulo(int a, int b) {
		if (a<=0|| b<=0) {
			throw new IllegalArgumentException();
		}
		this.a=a;
		this.b=b;
		this.c=hipotenusa();
	
	}
	/**
	 * 
	 * @return devuelve el area de el triangulo
	 */
	public double area() {
		double area = a*b/2;
		return area;
	}
	/**
	 * 
	 * @return devuelve la hipotenusa de el triangulo
	 */
	private double hipotenusa() {
		double c = Math.sqrt((a*a) + b*b);
		return c;
	}
	/**
	 * 
	 * @return devuelve el perimetro de el tgriangulo
	 */
	
	public double perimetro() {
		double d = a+b+c;
		return d;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Los valores de los lados son: a=" + a + ", b=" + b + ", c=" + c ;
	}
}
