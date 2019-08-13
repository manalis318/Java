package student;

import java.util.Scanner;

public class InternalStudent extends Student {
	private String univ;
	private double per;
	
	public InternalStudent() {
		super();
		univ=null;
		per=0;
	}
	public InternalStudent(int rn,String n,int d,int m,int y,String un,double p) {
		super(rn,n,d,m,y);
		univ=un;
		per=p;
	}
	public void display() {
		super.display();
		System.out.println("University = "+univ);
		System.out.println("Percentage = "+per);
	}
	public void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the University : ");
		univ=s.next();
		System.out.println("Enter the Percentage :");
		per=s.nextDouble();
		super.accept();
	}
}
