class SaloonCar //�� ����
{
	public void startUp(Benzine b)
	{
			if(b.isEnough())
				System.out.println("�������㣡");
		}
}
class Benzine //������
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
