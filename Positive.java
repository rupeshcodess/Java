import java.util.Scanner;

public class Positive
 {
    public static void main(String[] args)
    {
        byte b1;
        Scanner scin=new Scanner(System.in);
        System.out.println("Enter NO :");   
        b1 =scin.nextByte();

        if(b1>0)
        {
            System.out.println("It is Positive Number "); 
        }
	else if(b1==0)
	{
            System.out.println("It is Neither Negative Nor Positive "); 
        }
        else
        {
	    System.out.println("It is a Negative Number"); 
        }
     }
}