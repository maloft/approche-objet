package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		/*Créez une instance de la classe java.util.Date à la 
		 * date du jour en utilisant un de ses constructeurs */
		Date date = new Date();
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage.format(date));
		
		
		
		/* Créez une instance de la classe Date à la date 
		 * du 19 mai 2016 à 23h59 et 30 secondes */
		
		Date d = new Date(116, 5, 19, 23, 59, 30);
		SimpleDateFormat formattage1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage1.format(d));
		
		
		
		

		
		
		

	}

}
