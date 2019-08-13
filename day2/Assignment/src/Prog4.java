import java.util.Scanner;


public class Prog4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j=0,n,temp;
		int []a;
		System.out.println("Enter number of elements: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=n;i>0;i++)
		{
			System.out.println();
		}
		
	}
}
