//�������ܵ��õĳ�Ա,ֻ�ܵ���
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
		System.out.println("name="+a.f+"  aname = "+a.fa);//����ͨ��������������˽�г�Ա
	}
}
