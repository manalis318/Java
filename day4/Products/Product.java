package Products;

import java.util.Scanner;

public class Product implements Cloneable {
	private int pid;
	private String pname;
	private double cost;
	
	public Product() {
		pid=0;
		pname=null;
		cost=0;
	}
	public Product(int p,String n,double c) {
		pid=p;
		pname=n;
		cost=c;
	}
	public void display() {
		System.out.println("Product id = "+pid);
		System.out.println("Product name = "+pname);
		System.out.println("Product cost = "+cost);
		System.out.println();
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	public void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Product id :");
		pid=s.nextInt();
		System.out.println("Enter the Product name :");
		pname=s.next();
		System.out.println("Enter the Product cost :");
		cost=s.nextDouble();
	}
	public void setCost(double c) {
		cost=c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	
	}
