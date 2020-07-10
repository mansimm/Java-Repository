// Private Constructor example

public class SingletonClass
{
	// Static class reference
	private static SingletonClass obj = null;

	private SingletonClass()
	{
		/* Private constructor prevent the instatiation of this class onject directly */
	}

	public static SingletonClass ObjectCreationMethod()
	{
		/* This method insures that no more than one object cannot be created at a time */
		if(obj==null)
		{
			obj = new SingletonClass();
		}
		return obj;
	}
	public static void display()
	{
		System.out.println(" Display method is called !");
	}
	public static void main(String arg[])
	{
		// object cannot be created directly due to private constructor
		// object can be created using method ObjectCreationMethod()
		// only one object is created at a time
		SingletonClass obj = ObjectCreationMethod();
		obj.display();
	}
}
