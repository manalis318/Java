import java.util.Scanner;


public class assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ar[]=new int[6];
		int nar[]=new int[6];
		int max=0,min=0,i;
		System.out.println("Enter the 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=5;i++){
			ar[i]=sc.nextInt();
		}
		max=ar[1];
		min=ar[1];
		System.out.println(" a. Now Calculating the Maximum and Minimum in the array");
		for(i=2;i<=5;i++){
			if(ar[i]>=max)
				max=ar[i];
		}
		for(i=2;i<=5;i++){
			if(ar[i]<=min)
				min=ar[i];
		}
		System.out.println("Maximum = "+max+" ; "+"Minimum = "+min);
		System.out.println();
		System.out.println(" b. Multiply and store the array in another array");
		for(i=1;i<=5;i++){
			nar[i]=(ar[i]* 5);
		}
		System.out.println("original array :");
		for(i=1;i<=5;i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("new array :");
		for(i=1;i<=5;i++){
			System.out.print(nar[i]+" ");
		}
	}

}
