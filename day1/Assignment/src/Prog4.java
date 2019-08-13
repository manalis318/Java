import java.util.Scanner;


public class Prog4 {

	public static void main(String [] args) {
		
		double bs,netSal,gs,hra,pf,da;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the salary: ");
		bs=sc.nextInt();
		hra= (bs*15)/100;
		da= (bs*30)/100;
		gs= bs+hra+da;
		pf= (gs*(12.5))/100;
		netSal= gs-pf;
		System.out.println("Net Salary = "+netSal);
		
		
	}

}

