
public class Sfera extends Solido
{

	private double raggio;
	
	
	public Sfera(double pesoSpecifico, double raggio)
	{
		super(pesoSpecifico);
		this.raggio=raggio;
	}
	
	public Sfera (Sfera sfera)
	{
		super(sfera.getPesoSpecifico());
		this.raggio=sfera.getRaggio();
		
	}
	public double getRaggio()
	{
		return this.raggio;
	}

	@Override
	public double superficie() 
	{
		return (4*Math.PI*getRaggio()*getRaggio());
	}

	@Override
	public double volume() 
	{
		return (4/3 * Math.PI*getRaggio()*getRaggio()*getRaggio());
	}
	
	public String toString()
	{
		return ("Superficie: "+superficie()+" "+ " Volume: "+volume()+" Peso "+peso());
	}

	

	public Sfera clone()
	{
		Sfera s= new Sfera(getPesoSpecifico(),getRaggio());
		return s;
	}

}
