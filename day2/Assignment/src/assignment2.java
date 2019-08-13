import java.util.Scanner;


public class assignment2 {

	public static void main(String[] args) {
		int ar[][]=new int[4][4];
		int tr[][]=new int[4][4];
		int br[][]=new int[4][4];
		int sum[][]=new int[4][4];
		int i,j;
		System.out.println("Enter the elements of the matrix");
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("The ordered array matrix is :");
		System.out.println();
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" a. Transposing the matrix");
		System.out.println();
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				tr[i][j]=ar[j][i];
			}
		}
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(tr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Enter the elements of another matrix");

		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				br[i][j]=sc.nextInt();
			}
		}
		System.out.println(" b. Adding the two matrices");
		
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				sum[i][j]=ar[i][j]+br[i][j];
			}
		}
		System.out.println();
		System.out.println("Addition is :");
		System.out.println();
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
