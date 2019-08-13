import java.util.Scanner;


public class Prog1a 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,max,min;
		int []c;
		c=new int[5];
		System.out.println("Enter array elements");
		for(i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		
		max=c[0];
		min=c[0];
		for(i=0;i<5;i++)
		{
			if(c[i]>max)
				max=c[i];
			
			if(c[i]<min)
				min=c[i];
		}
		
		System.out.println("Maximum number is "+max);

		System.out.println("Minimum number is "+min);
		
	}
}
