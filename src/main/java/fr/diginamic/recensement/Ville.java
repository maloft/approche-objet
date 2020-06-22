package fr.diginamic.recensement;


/**
 * Cette classe nous permet de créer un objet Ville qui représente une ville avec 
 * toutes les données qui lui correspondent
 * @author abdel
 *
 */

public class Ville {
	
	/** Les données qui caractérisent une villes : */
	private String codeRegion;
	private String nomRegion;
	private String codeDep;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	/**Constructeur par défaut : */
	public Ville() {}
	
	/**Constructeur avec paramètres */
	
	public Ville(String codeRegion, String nomRegion, String codeDep, String codeCommune, String nomCommune, int populationTotale)
	{
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDep = codeDep;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	/** Getters */
	
	public String getCodeRegion()
	{
		return this.codeRegion;
	}
	
	public String getNomRegion()
	{
		return this.nomRegion;
	}
	public String getCodeDep()
	{
		return this.codeDep;
	}
	public String getCodeCommune()
	{
		return this.codeCommune;
	}
	public String getNomCommune()
	{
		return this.nomCommune;
	}
	public int getPopulationTotale()
	{
		return this.populationTotale;
	}
	
	@Override
	public String toString()
	{
		return "Les informations concernant la ville : " + "\n" +
				"Code de la région : " + this.codeRegion + "\n" +
				"Nom de la région : " + this.nomRegion + "\n" +
				"Code du département : " + this.codeDep + "\n" +
				"Code de la commune : " + this.codeCommune + "\n" +
				"Nom de la commune : " + this.nomCommune + "\n" +
				"Population totale : " + this.populationTotale;
	}
	
	
	
	
	
		

}
