import java.util.Scanner;


public class Prog5 {

	public static void main(String [] args) {
		
		double netSal,bs,salesAmt,comm=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the basic salary: ");
		bs=sc.nextDouble();
		System.out.println("Enter the total sales amount: ");
		salesAmt=sc.nextDouble();
		
		if(salesAmt>=5000 && salesAmt<=7500){
			comm=(salesAmt*3)/100;
		}
		else{
			if(salesAmt>=7501 && salesAmt<=10500){
				comm=(salesAmt*8)/100;
			}
			else{
				if(salesAmt>=10501 && salesAmt<=15000){
					comm=(salesAmt*11)/100;
				}
				else{
					if(salesAmt>=15001){
						comm=(salesAmt*15)/100;
					}
				}
			}
		}
		
		netSal=bs+comm;
		System.out.println("Net Salary = "+netSal);
		System.out.println("Commision earned = "+comm);
		
		
	}

}

