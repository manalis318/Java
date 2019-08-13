import java.util.Scanner;


public class Prog1 {

	public static void main(String [] args) {
		
		
		int m1,m2,m3,m4,m5,av;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of English");
		m1=sc.nextInt();
		System.out.println("Enter marks of Hindi");
		m2=sc.nextInt();
		System.out.println("Enter marks of Maths");
		m3=sc.nextInt();
		System.out.println("Enter marks of Science");
		m4=sc.nextInt();
		System.out.println("Enter marks of Social");
		m5=sc.nextInt();
		
		av=(m1+m2+m3+m4+m5)/5;
		System.out.println("The average is "+av);
	}

}

