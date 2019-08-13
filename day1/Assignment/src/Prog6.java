import java.util.Scanner;


public class Prog6 {

	public static void main(String [] args) {
		
		double a,b,c;
		int x;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two variables: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Press 1 for addition.");
		System.out.println("Press 2 for subtraction.");
		System.out.println("Press 3 for multiplication.");
		System.out.println("Press 4 for division.");
		System.out.println("Enter your choice: ");
		x=sc.nextInt();
		
		switch(x){
		case 1:{
			c=a+b;
			System.out.println(+a+ " + " +b+ " = " +c);
			break;
		}
		case 2:{
			c=a-b;
			System.out.println(+a+ " - " +b+ " = " +c);
			break;
		}
		case 3:{
			c=a*b;
			System.out.println(+a+ " * " +b+ " = " +c);
			break;
		}
		case 4:{
			c=a/b;
			System.out.println(+a+ " / " +b+ " = " +c);
			break;
		}
		}
		
	}

}

