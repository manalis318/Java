import java.util.Scanner;


public class Prog7 {

	public static void main(String [] args) {
		
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter three variables: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.println(+a+ " is max");
		}
		else{
			if(b>c && b>a){
				System.out.println(+b+ " is max");
			}
			else{
				System.out.println(+c+ " is max");
			}
		}
	}

}

