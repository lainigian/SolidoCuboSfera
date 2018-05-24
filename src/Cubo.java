
public class Cubo extends Solido
{
	private double lato;
	public Cubo(double pesoSpecifico, double lato)
	{
		super(pesoSpecifico);
		this.lato=lato;
	}
	
	public Cubo (Cubo cubo)
	{
		super(cubo.getPesoSpecifico());
		this.lato=cubo.getLato();
		
	}
	public double getLato() 
	{
		return lato;
	}

	@Override
	public double superficie()
	{
		return (lato*lato*6);
	}

	@Override
	public double volume() 
	{
		return (lato*lato*lato);
	}
	
	public String toString()
	{
		return ("Superficie: "+superficie()+" "+ " Volume: "+volume()+" Peso "+peso());
	}



	public Cubo clone()
	{
		Cubo c= new Cubo(getPesoSpecifico(),getLato());
		return c;
		
	}
	
}
