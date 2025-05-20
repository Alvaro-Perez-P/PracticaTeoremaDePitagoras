package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * aqui se crea un rectangulo con numeros entre 0 y 10
		 */
		TrianguloRectangulo triangulo = new TrianguloRectangulo(3,7);
		/**
		 * aqui se crea un triangulo con los valores por defecto
		 */
		
		TrianguloRectangulo triangulo1 = new TrianguloRectangulo();
		
		/**
		 * calculo de area y perimetro de triangulo
		 */
		double area = triangulo.area();
		double perimetro = triangulo.perimetro();
		
		/**
		 * calculo de area y perimetro de triangulo1
		 */
		double area1= triangulo1.area();
		double perimetro1= triangulo1.perimetro();
	}

}
