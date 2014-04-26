import java.lang.reflect.*;

interface HasBatteries{}
interface Waterproof {}
interface Shoots {}

class Toy
{
	Toy()
	{
		System.out.println("Creating Toy() object");
	}
	Toy(int i)
	{
		System.out.println("Creating Toy("+i+") object");
	}
}

public class ToyTest19
{
	public static void main(String[] args)
	{
		try
		{
			Toy.class.getDeclaredConstructor(int.class).newInstance(1);
		}catch(NoSuchMethodException e)
		{
			System.out.println("No such method: "+e);
		}catch(InstantiationException e)
		{
			System.out.println("Unable make Toy: "+e);			
		}catch(IllegalAccessException e)
		{
			System.out.println("Ubable access: "+e);
		}catch(InvocationTargetException e)
		{
			System.out.println("Target invocation problem:"+e);
		}
	}
}
