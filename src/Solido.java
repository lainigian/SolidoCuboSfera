
public abstract class Solido implements Cloneable, FiguraSolida, CorpoSolido
{
	
	private double pesoSpecifico;
	
	public Solido(double pesoSpecifico)
	{
		this.pesoSpecifico=pesoSpecifico;
	}

	
	public double getPesoSpecifico()
	{
		return pesoSpecifico;
	}

	public abstract double superficie();
	public abstract double volume();
	
	public double peso()
	{
		return getPesoSpecifico()*volume();
	}

	public abstract Solido clone();
}
