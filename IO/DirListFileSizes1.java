import java.io.*;
import java.util.regex.*;
import java.util.*;

public class DirListFileSizes1
{
	public static void main(final String[] args)
	{
		File path = new File(".");
		File[] files;
		if(args.length == 0)
			files = path.listFiles();
		else
			files = path.listFiles(new FileFilter(){
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File file)
				{
					return pattern.matcher(file.getPath()).matches();
				}
			});
		Arrays.sort(files);
		long sum = 0;
		for(File f:files)
		{
			System.out.print(f + ": ");
			System.out.println(f.length());
			sum+=f.length();
		}
		System.out.println("Total size: "+sum);
	}
}