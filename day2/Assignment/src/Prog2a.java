import java.util.Scanner;


public class Prog2a 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int i=0,j=0;
		System.out.println("Enter the array elements");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		
		for(int []x:b)
		{
			for (int y:x)
			{
				System.out.print
				(y+" ");
			}
			System.out.println();
		}
		 
	}
}
