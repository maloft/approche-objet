
public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tabObj = new ObjetGeometrique[2];
		
		ObjetGeometrique c = new Cercle(4);
		ObjetGeometrique r = new Rectangle(1, 2);
		
		tabObj[0] = c;
		tabObj[1] = r;
		
		for(int i = 0 ; i < 2 ; i++ )
		{
			System.out.println("Le périmètre du " + tabObj[i].afficherType() + " est égale à " + tabObj[i].perimetre());
			System.out.println("Sa surface est égale à " + tabObj[i].surface());
		}
		
		
		

	}

}
