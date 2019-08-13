import java.util.Scanner;


public class Prog8 {

	public static void main(String [] args) {
		
		int n,r,temp,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		temp=n;
		
		while(n!=0){
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;	
		}
		
		if(sum==temp){
			System.out.println("Number is armstrong");
		}
		else{
			System.out.println("Number is not armstrong");
		}
		 
	}

}
