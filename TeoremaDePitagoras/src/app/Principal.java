package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo triangulo = new TrianguloRectangulo(3,7);
		
		TrianguloRectangulo triangulo1 = new TrianguloRectangulo();
		
		double area = triangulo.area();
		double perimetro = triangulo.perimetro();
		
		double area1= triangulo1.area();
		double perimetro1= triangulo1.perimetro();
	}

}
