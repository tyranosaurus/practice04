package prob5;

public class RecTriangle extends Shape 
{
	public double width = 0.0;
	public double height = 0.0;
	
	public RecTriangle(double width, double height)
	{
		super(3);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() 
	{	
		double result = 0.5*width*height;
		
		return result;
	}

	@Override
	public double getPerimeter() 
	{
		double result = width + height + Math.sqrt(width*width + height*height);
		
		return result;
	}

}
