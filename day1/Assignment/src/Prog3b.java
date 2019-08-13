import java.util.Scanner;


public class Prog3b {

	public static void main(String [] args) {
		
		int a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers to swap: ");
		a = sc.nextInt();
		b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the order is: "+a+" "+b);
		
	}

}

