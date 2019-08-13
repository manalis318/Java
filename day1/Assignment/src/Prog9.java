import java.util.Scanner;


public class Prog9 {

	public static void main(String [] args) {
		
		int n,i,temp=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		i=2;
		while(i<=n/2){
			if(n%i==0)
			{
				temp=1;
				break;
			}
			i++;
		}
		if(n==1){
			 System.out.println("The number is nor prime nor composite");
		 }
		else{
		 if(temp==0){
			 System.out.println("The number is prime");
		 }
		 else{
				 System.out.println("The number is composite");
		 }
		}
	}

}
