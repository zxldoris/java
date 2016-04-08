//对象引用的强制类型转换
class Car
{
	String m = "car";
}
class Truck extends Car
{
	String m = "truck";
}
public class Sample8_4
{
	public static void main(String[] args)
	{
		Car c = new Truck();
		System.out.println("It is "+((Truck)c).m);
	}
}
