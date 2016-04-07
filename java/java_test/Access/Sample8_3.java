class Father
{
	String s = "father";
}
class Son extends Father
{
	String s = "son";
	public void show()
	{
		System.out.println("调用的是："+super.s);
	}
}
public class Sample8_3
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.show();
	}
}
