package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		/** Utilisation de certaines méthodes de la classe String : */
		
		char premierCaractere = chaine.charAt(0);
		
		int tailleChaine = chaine.length();
		
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("La taille de la chaine de caractères est : " + tailleChaine); 
		
		/** Première apparition de ';' dans la chaine : */
		System.out.println("L'index de la première apparition de ';' : " + chaine.indexOf(";"));
		
		/** Utilisation de la méthode sbstring(int , int) pour extraire le nom de famille : */
		String nomDeFamille = chaine.substring(0, chaine.indexOf(";"));
		System.out.println("Le nom de famille est : " + nomDeFamille);
		
		/** Afficher le nom de famille en majuscules : */
		String nomMaj = nomDeFamille.toUpperCase();
		System.out.println("Nom de famille en majuscule : " + nomMaj );
		
		/** Afficher le nom de famille en minuscules : */
		String nomMin = nomDeFamille.toLowerCase();
		System.out.println("Nom de famille en majuscule : " + nomMin );
		
		/** Découper la chaine de caractères en morceaux. Le caractère de séparation des morceaux est ';' */
		String[] morceaux = chaine.split(";");
		
		/** Affichage des morceaux de la chaine de caractères. */
		for (String c : morceaux)
		{
			System.out.println(c);
		}
	}

}
