import java.util.Scanner;

class Sgpi{
  	 public static void main(String args[])
 {
  	float no;
 	Scanner scin=new Scanner(System.in);
	System.out.println("Enter SGPI");
	no=scin.nextFloat();

	if(no>10)
	{
		System.out.println("INVALID SGPI");
	}
	else if(no>=9)
	{
		System.out.println("O");
	}
	else if(no>=8)
	{
		System.out.println("A+");
	}
	else if(no>=7)
	{
		System.out.println("A");
	}
	else if(no>=6)
	{
		System.out.println("B+");
	}
	else if(no>=5)
	{
		System.out.println("B");
	}
	else if(no>=4)
	{
		System.out.println("C+");
	}
	else if(no>=3)
	{
		System.out.println("C");
	}
	else
	{
		System.out.println("FAIL");
	}

}
}