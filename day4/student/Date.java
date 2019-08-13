package student;

import java.util.Scanner;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date() {
		dd=01;
		mm=01;
		yy=2000;
	}
	public Date(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	public void display() {
		System.out.println("Date = "+dd+"/"+mm+"/"+yy);
	}
	public void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day :");
		dd=s.nextInt();
		System.out.println("Enter the month :");
		mm=s.nextInt();
		System.out.println("Enter the year :");
		yy=s.nextInt();
	}
}
