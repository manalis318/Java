package student;

import java.util.Scanner;

public class ExternalStudent extends Student {
	private String inst;
	private char grade;
	
	public ExternalStudent() {
		super();
		inst=null;
		grade='F';
	}
	public ExternalStudent(int rn,String n,int d,int m,int y,String in,char g) {
		super(rn,n,d,m,y);
		inst=in;
		grade=g;
	}
	public void display() {
		super.display();
		System.out.println("Institute = "+inst);
		System.out.println("Grade = "+grade);
	}
	public void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Institute : ");
		inst=s.next();
		System.out.println("Enter the Grade :");
		grade=s.next().charAt(0);
		super.accept();
	}
}
