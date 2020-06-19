package fr.diginamic.testexceptions;

import sets.Pays;


public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		
		Pays pays = new Pays("USA", 328_239_523, 62606);
		
		try {
			
			ReflectionUtils.afficherAttributs(pays);
			
		}catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
