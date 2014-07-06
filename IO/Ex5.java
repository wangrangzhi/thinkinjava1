import java.io.*;
import java.util.regex.*;
import net.mindview.util.*;

public class Ex5
{
	public interface Strategy
	{
		void process(File file);
	}
	private Strategy strategy;
	private String regex;
	public ProcessFiles5(Strategy strategy, String regex)
	{
		this.strategy = strategy;
		this.regex = regex;
	}

	public void start(String[] args)
	{
		try
		{
			if(args.length == 0)
				processDirectoryTree(new File("."));
			else
				for(String arg : args)
				{
					File fileArg = new File(arg);
					if(fileArg.isDirectory())
						processDirectoryTree(fileArg);
					else
					{
						Pattern pattern = Pattern.compile(regex);
						if(pattern.matcher(arg).matches())
							strategy.process(new File(arg).getCanonicalFile());
					}
				}
		}catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public void processDirectoryTree(File root) throws IOException
	{
		for(File file : Directory.walk(root.getAbsolitepath(), regex))
			strategy.process(file.getCanonicalFile());
	}

	public static void main(String[] args)
	{
		new Ex5(new Ex4.Strategy(){
			public void process(File file)
			{
				Ststem.out.println(file);
			}
		}, ".*D.*").start(args);
	}

	
}