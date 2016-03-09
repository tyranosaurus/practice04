package prob5;

public class RecTangle extends Shape implements Resizable 
{

	public double width = 0.0;
	public double height = 0.0;
	
	public RecTangle(double width, double height)
	{
		super(4);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void resize(double rate) 
	{
		width *= rate;
		height *= rate;
	}

	@Override
	public double getArea() 
	{
		double result = width*height;
		
		return result;
	}

	@Override
	public double getPerimeter() 
	{
		double result = 2*(width+height);
		
		return result;
	}
	

}
