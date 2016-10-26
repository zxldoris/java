//对象所能调用的成员,只能调用
class Fruit
{
	String f = "fruit";
}
class Apple extends Fruit
{
	String f = "apple";
	String fa = "applea";
}
public class Sample8_5
{
	public static void main(String[] args)
	{
		Fruit a = new Apple();
		System.out.println("name="+a.f+"  aname = "+a.fa);//不能通过父类访问子类的私有成员
	}
}
