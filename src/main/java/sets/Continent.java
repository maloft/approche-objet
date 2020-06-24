package sets;

public enum Continent {
	
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	AMERIQUEDUNORD("Amérique du nord"),
	AMERIQUEDUSUD("Amérique du sud"),
	OCEANIE("Océanie");
	
	private String nom;

	private Continent(String nom) {
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	

}
