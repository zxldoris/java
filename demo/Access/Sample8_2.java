class SaloonCar 
{
	private Tire a = new Tire();
	public Tire getTire()
	{
		return a;
	}
}
class Tire
{
	private String color = "ºÚÉ«";
	private String material = "Ïð½º";
	public String getMaterial()
	{
		return material;
	}
	public String getColor()
	{
		return color;
	}
}
public class Sample8_2
{
	public static void main(String[] args)	
	{
		SaloonCar sc = new SaloonCar();
			System.out.println("color:"+sc.getTire().getColor()+"meterail:"+sc.getTire().getMaterial());
	}
}
