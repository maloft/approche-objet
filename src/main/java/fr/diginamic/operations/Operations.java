package fr.diginamic.operations;

public class Operations {
	
	/** Cette méthode de classe permet d'effectuer une opération (+,-,* ou /) entre 2 réels. */
	public static double calcul (double a, double b, char op)
	{
		double res = 0;
		
		
		if (op == '+')
		{
			res = a + b;
		}
		else if (op == '-')
		{
			res = a - b;
		}
		else if (op == '*')
		{
			res = a * b;
		}
		else if (op == '/' && b != 0)
		{
			res = a / b;
		}
		
		return res;
	}

}
