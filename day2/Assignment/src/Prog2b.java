import java.util.Scanner;


public class Prog2b {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i=0,j=0;
		System.out.println("Enter the array elements");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter another array elements");
		for (i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int []x:c)
		{
			for (int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		 
	}

}
