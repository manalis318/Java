package student;

import java.util.Scanner;

public class Student extends Date {
	private int rollno;
	private String name;
	private Date dob;
	
	public Student() {
		super();
		rollno=0;
		name=null;
	}
	public Student(int rn,String n,int d,int m,int y) {
		super(d,m,y);
		rollno=rn;
		name=n;
	}
	public void display() {
	System.out.println("Roll no = "+rollno);
	System.out.println("Name = "+name);
	super.display();
	}
	public void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Roll No : ");
		rollno=s.nextInt();
		System.out.println("Enter the Name :");
		name=s.next();
		super.accept();
	} 
}

