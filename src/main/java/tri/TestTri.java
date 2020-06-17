package tri;

import java.util.ArrayList;
import java.util.Collections;

import sets.Pays;

public class TestTri {

	public static void main(String[] args) {
		
		ArrayList<Pays> pays = new ArrayList<>();
		
		pays.add(new Pays("USA", 328_239_523, 62606));
		pays.add(new Pays("France", 69_861_344, 43551));
		pays.add(new Pays("Allemagne", 82_801_531, 50206));
		pays.add(new Pays("UK", 63_421_628, 43620));
		pays.add(new Pays("Italie", 61_302_519, 37970));
		pays.add(new Pays("Japon", 124_856_424, 42659));
		pays.add(new Pays("Chine", 1_408_089_559, 16624));
		pays.add(new Pays("Russie", 126_434_660, 27900));
		pays.add(new Pays("Inde", 1_386_249_417, 5174));
		
		Collections.sort(pays); //Trier les pays dans l'ordre alphabétique
		
		
		for (Pays paysTri : pays)
		{
			paysTri.afficherPays(); //Affichage dans l'ordre alphabétique
		}

	}

}
