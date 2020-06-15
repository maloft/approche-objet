package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestMoyenne {

	public static void main(String[] args) {
		
		/** Vérification du bon fonctionnement de la classe CalculMoyenne */
		CalculMoyenne tab1 = new CalculMoyenne();
		CalculMoyenne tab2 = new CalculMoyenne();
		
		double moy1 = 0.0 , moy2 = 0.0;
		
		double elm1 = 2.0;
		double elm2 = 5.0;
		
		for (int i = 0; i < 10; i++)
		{
			tab1.ajout(elm1);
			elm1 += 1;
			
			tab2.ajout(elm2);
			elm2 += 5;
				
		}
		/** Vérifier si ajout() marche correctement : */
		System.out.println(tab1.getTab());
		System.out.println(tab2.getTab());

		moy1 = tab1.calcul(); /** On est censé obtenir moy1 = 6.5*/
		moy2 = tab2.calcul(); /** On est censé obtenir moy2 = 27.5 */
		
		/** Vérifier si calcul() marche correctement :  */
		System.out.println("La moyenne de tab1 est : " + moy1);
		System.out.println("La moyenne de tab2 est : " + moy2);

	}

}
