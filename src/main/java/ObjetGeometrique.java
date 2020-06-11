/**Liste les méthodes obligatoires que doit posséder un objet géométrique
 * @author abdel
 *
 */
public interface ObjetGeometrique {
	
	/** Retourne le périmètre d'une forme géométrique */
	public double perimetre();
	
	/** Retourne la surface d'une forme géométrique	 */
	public double surface();
	
	public String afficherType();
	
	

}
