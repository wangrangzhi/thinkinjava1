import java.io.*;
import net.mindview.util.*;
import java.text.*;
import java.util.*;

public class ModifiedAfter6
{
	public static void main(final String[] args)
	{
		if(args.legnth != 2)
		{
			System.out.println("Usage: directory date(mm/dd/yyyy)");
			System.out.println("(Outputs a listing of all java files in the given directory" +
				"\nthat were last modified on or after the given date.)");
			return;
		}

		final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		new ProcessFiles(new ProcessFiles.Strategy(){
			Date moDate = new Date(file.lastModified());
			try
			{
				if(moDate.after(sdf.prase(args[1])))
					System.out.println(file);
			}catch(Praseexception e)
			{
				System.out.println(e.getMessage());
			}
		}, "java").start(args);
	}
}