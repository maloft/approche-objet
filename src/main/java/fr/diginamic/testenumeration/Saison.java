package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMN("Automn", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int numOrdre; 
	
	
	Saison(String libelle, int numOrdre) {
		this.setLibelle(libelle);
		this.setNumOrdre(numOrdre);
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getNumOrdre() {
		return numOrdre;
	}


	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	public String toString() {
		return this.getLibelle() + " , " + this.getNumOrdre();
	}
	
	/** Méthode qui retourne une instance de Saison en fonction du libellé : */
	
	public static Saison libelleSaison(String libelle) {

		for (Saison s : Saison.values())
		{
			
			if (s.getLibelle().equals(libelle))
			{
				return s;
			}
		}
		return null;
	}


	
	

}
