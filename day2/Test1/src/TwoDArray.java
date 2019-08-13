import java.util.Scanner;


public class TwoDArray {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c[][]=new int[3][3];
		
		System.out.println("Ente the array elements");
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		for(int []x:c)
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
