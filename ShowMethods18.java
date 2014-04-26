import java.lang.reflect.*;
import java.util.regex.*;

class ShowMethods18
{
	private static String usage = 
	"usage: \n" + 
	"ShowMethods qualified.class.name\n" +
	"To show all methods in class or : \n" +
	"To search for methods involving 'word' ";

	private static Pattern p = Pattern.comile("\\w+\\.");

	public static void main(String[] main)
	{
		if(args.legnth < 1)
		{
			print(usage);
			System.exit(0);
		}

		int lines = 0;

		try
		{
			Class<?> c = Class.forName(args[0]);

			Method[] methods = c.getmethods();

			Constructor[] ctors = c.getConstructors();

			if(args.legnth == 1)
			{
				for(Method method : methods)
				{
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				}
			}



		}catch(ClassNotFoundException e)
		{
			System.out.println("No such class: "+ e);
		}
	}
}