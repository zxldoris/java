public class Sample4_3
{
	public static void main(String[] args)
	{
		int a=1;
		switch(a)
		{
			case 1: System.out.println("1");
			case 2: System.out.println("2");
			case 3: System.out.println("3");

		}
		System.out.println("\n");
		a=4;
		switch(a)
		{
			case 1: System.out.println("1");
			default: System.out.println("default");
			case 2: System.out.println("2");
			case 3: System.out.println("3");
		}
		System.out.println("\n");
	}
}
