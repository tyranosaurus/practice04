package prob5;

public abstract class Shape 
{
	private int countSides;
	
	public Shape(int countSides)
	{
		this.countSides = countSides;
	}
	
	public void getCountSides()
	{
		
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
	
	
}
