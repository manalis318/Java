import java.util.Scanner;


public class Prog1b 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int []a;
		int []b;
		a=new int[5];
		b=new int[5];
		System.out.println("Enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<5;i++)
		{
			b[i]=a[i]*5;
		}
		
		for(int x:b)
		{
			System.out.println(x+" ");
		}
	}
}
