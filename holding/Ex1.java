import java.util.*;
class Gerbil
{
	private int gerbilNumber;
	public Gerbil(int i)
	{
		gerbilNumber = i;
	}

	public void hop()
	{
		System.out.println("Gerbil" + gerbilNumber + "hops!");
	}
}

public class Ex1
{
	public static void main(String[] args)
	{
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i<10; i++)
			gerbils.add(new Gerbil(i));
		for(int i = 0; i<10; i++)
			gerbils.get(i).hop();
		for(Gerbil g : gerbils)
			g.hop();
	}
}