package fr.diginamic.essais;

import fr.diginamic.operations.*;


public class TestOperations {

	public static void main(String[] args) {
		double a = 4.8 , b = 1.2;
		
		/** Test de la méthode de classe Operations.calcul(double a, double b, char op) */
		System.out.println("a + b = " + Operations.calcul(a, b, '+'));
		System.out.println("a - b = " + Operations.calcul(a, b, '-'));
		System.out.println("a * b = " + Operations.calcul(a, b, '*'));
		System.out.println("a / b = " + Operations.calcul(a, b, '/'));

	}

}
