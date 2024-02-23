class Fy
{
public void jc()
	{
	 	System.out.println("11th");
	}
}

class Sy extends Fy
{

public void jc()
	{
		System.out.println("12th");
	}
}

class Trial2aa
{
	public static void main(String[] args)
	{
		Sy sy = new Sy();
		sy.jc();
	}                                
}