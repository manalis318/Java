import java.util.Scanner;


public class assignment4 {

	
	public static void main(String[] args) {
		int ar[]=new int[10];
		int br[]=new int[10];
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		System.out.println("Enter the elements of array");
		for(i=1;i<=size;i++){
			ar[i]=sc.nextInt();
		}
		for(i=1;i<=size;i++){
			br[i]=ar[size-i+1];					
		}
		System.out.println("The new array is :");
		for(i=1;i<=size;i++){
			System.out.print(br[i]+" ");
		}
		

	}

}
