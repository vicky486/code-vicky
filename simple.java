/* package whatever; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class simple
{
	public static void main (String args[])throws IOException
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>0)
			System.out.println("positive");
		else if(a<0)
			System.out.println("negative");
        else
			System.out.println("zero");
		
	}
}
