import java.util.Scanner;


public class assignment3 {

	
	public static void main(String[] args) {
		int ar[][]=new int[4][4];
		int br[][]=new int[4][4];
		int mul[][]=new int[4][4];
		int i,j,k;
		System.out.println("Enter the elements of the matrix A");
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				ar[i][j]=sc.nextInt();
			}
		}System.out.println("Enter the elements of the matrix B");
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				br[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix A");
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix B");
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(br[i][j]);
			}
			System.out.println();
		}
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				mul[i][j]=0;
				for(k=1;k<=3;k++){
					mul[i][j]+=ar[i][k]*br[k][j];
				}
			}
		}
		System.out.println("Matrix Multiplication");
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
				System.out.print(mul[i][j]);
			}
			System.out.println();
		}
	}

}
