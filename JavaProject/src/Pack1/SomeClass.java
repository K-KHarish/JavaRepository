package Pack1;

public class SomeClass {
	public static MyInterface
	getMyInterface()
	{
		return new MyInterface()
				{
					public void disp()
					{
						System.out.println("Inside anonymous inner class disp");
					}
				};
	}
}
