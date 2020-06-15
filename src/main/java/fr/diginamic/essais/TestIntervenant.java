package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Intervenant s = new Salarie("Einstein", "Albert", 2300), p = new Pigiste("Plank", "Max", 12, 9.70);
		
		System.out.println("Le salaire du salarié est : " + s.getSalaire() + " $");
		System.out.println("Le salaire du pigiste est : " + p.getSalaire() + " $");

	}

}
