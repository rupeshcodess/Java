import java.util.Scanner;

public class whole {
    public static void main(String[] args)
    {
        byte b1;
        Scanner scin=new Scanner(System.in);
        System.out.println("Enter NO :");   
        b1 =scin.nextByte();

        if(b1>=0)
        {
            System.out.println("It is whole Number "); 
        }
        else
        {
	    System.out.println("It is Not a Whole Number"); 
        }
     }
}