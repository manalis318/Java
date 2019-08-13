package com.zensar;

class Product {
	private int pid;
	private String pname;
	private double pcost;
	private static int cnt;
	
	
	public Product() {
		super();
		cnt++;
	}
	public Product(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		cnt++;
	}
	public static void showCut()
	{
		System.out.println("Number of objects are"+cnt);
	}
	

}
public class One
{
	public static void main(String args[])
	{
		Product product=new Product();
		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product(111,"Akshay",1234);
		Product.showCut();
	}
}