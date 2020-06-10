package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		
		String nb = "1345";
		
		
		/** Utilisation de la méthode static Integer.parseInt qui transforme un String en entier */
		int nb_ = Integer.parseInt(nb); 
		
		System.out.println(nb_);
		
		int a = 13, b = 15;
		
		int max = Integer.max(a, b); 
		
		
		System.out.println(max);

	}

}
