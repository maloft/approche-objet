package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
		
		
		Cercle c1 = CercleFactory.creerCercle(2.0);
		Cercle c2 = CercleFactory.creerCercle(3.0);
		
		System.out.println("Le périmètre de c1 est : " + c1.perimetre());
		System.out.println("La surface de c1 est : " + c1.surface());
		
		System.out.println("Le périmètre de c2 est : " + c2.perimetre());
		System.out.println("La surface de c2 est : " + c2.surface());

	}

}
