class SaloonCar //类 汽车
{
	public void startUp(Benzine b)
	{
			if(b.isEnough())
				System.out.println("油量充足！");
		}
}
class Benzine //汽油类
{
	private int a = 100;
	public boolean isEnough()
	{
		if(a>80)
			return true;
		else 
			return false;
	}
}
public class Sample8_1
{
	public static void main(String[] args)
	{
		Benzine b = new Benzine();
		SaloonCar sc = new SaloonCar();
		sc.startUp(b);
	}
}
