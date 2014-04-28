class A { int i; String s; }

class B extends A {int j; float f}; 

class C extends B {int k; B b; }

public calss Ex9
{
	public static void Hierarchy(Object o)
	{
		Object[] fields = o.getClass().getDeclaredFields();

		
	}
}