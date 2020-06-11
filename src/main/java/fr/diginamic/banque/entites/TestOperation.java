package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation c1 = new Credit("21/2/19", 123),
				  c2 = new Credit("3/4/14", 432.3),
				  d1 = new Debit("23/2/13", -433.3),
				  d2 = new Debit("2/3/12", -344.3);
		
		Operation[] tabOp = {c1, c2, d1, d2};
		
		double montantGlobal = 0.0;
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Opération " + i + " :" + "\n" + "Type : " + tabOp[i].afficherType() + "\n" +
		"Date : " + tabOp[i].getDate() +"\n" + "Montant " + String.valueOf(tabOp[i].getMontant()) + "\n");
			
			montantGlobal += tabOp[i].getMontant();
		}
		
		montantGlobal = (double)Math.round(montantGlobal*100)/100;
		
		System.out.println("Le montant global est de : " + montantGlobal);


	}

}
