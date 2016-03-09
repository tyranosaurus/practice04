package prob5;

public class ShapeTest 
{

	public static void main(String[] args) 
	{
		RecTangle rectangle = new RecTangle(5.0, 6.0);
		RecTriangle rectriangle = new RecTriangle(6.0, 2.0);
		
		Object[] obj = {rectangle, rectriangle};
		
		for (int i = 0; i < obj.length; i++)
		{	

			if (obj[i].getClass() == rectangle.getClass())
			{
				System.out.println("area: " + ((RecTangle) obj[i]).getArea());
				System.out.println("perimeter: " + ((RecTangle) obj[i]).getPerimeter());
				
				((RecTangle) obj[i]).resize(0.5);
				System.out.println("new area: " + ((RecTangle) obj[i]).getArea());
				System.out.println("new perimeter: " + ((RecTangle) obj[i]).getPerimeter());
			}
			else 
			{
				System.out.println("area: " + ((RecTriangle) obj[i]).getArea());
				System.out.println("perimeter: " + ((RecTriangle) obj[i]).getPerimeter());
			}
		}
		
	}

}
