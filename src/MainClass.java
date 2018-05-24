
public class MainClass
{

	public static void main(String[] args) 
	{
		
		
		Solido[] elencoSolidi=new Solido[5];
		Solido[] elencoCopia=new Solido[5];
		
		
		for (int i = 0; i < 5; i++) 
		{
			if (Math.random()>0.5)
				elencoSolidi[i]=new Cubo (1,i);
			else 
				elencoSolidi[i]=new Sfera (1,i);
			
		}
		
		
		double sommaVolumi=0;
		double volumeMedio=0;
		
		for (int i = 0; i < 5; i++) 
		{
			elencoCopia[i]=elencoSolidi[i].clone();
		}
		
		
	/*calcola somma dei volumi	
		for (int i = 0; i < 5; i++)
		{
			if (elencoSolidi[i] instanceof Cubo)
			{
				sommaVolumi+=((Cubo)elencoSolidi[i]).volume();
			}
			if (elencoSolidi[i] instanceof Sfera)
			{
				sommaVolumi+=((Sfera)elencoSolidi[i]).volume();
			}
			if (elencoSolidi[i] instanceof Cilindro)
			{
				sommaVolumi+=((Cilindro)elencoSolidi[i]).volume();
			}
			
		}
	*/	
	// ruota solido di x gradi
		
		
	//spost solidi verso dx..	

		for (int i = 0; i < 5; i++)
		{		
			sommaVolumi+=elencoSolidi[i].volume();		
		}
		
		
		System.out.println(sommaVolumi);
		
		
	
		
		
		
	
	
	}

}
