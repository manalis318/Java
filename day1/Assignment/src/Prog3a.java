import java.util.Scanner;


public class Prog3a {

	public static void main(String [] args) {
		
		int a,b,temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers to swap: ");
		a = sc.nextInt();
		b = sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the order is: "+a+" "+b);
		
	}

}

