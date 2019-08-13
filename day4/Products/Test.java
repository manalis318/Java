package Products;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
		throws CloneNotSupportedException
		{
			/*Product p1=new Product(12,"Cellphone",20000);
			Product p2=(Product)p1.clone();*/
			
		Product p1=new Product(12,"Cellphone",20000);
		Product p2=new Product(12,"Cellphone",20000);
		p1.display();
		p2.display();
		p1.setCost(1000);
		p1.display();
		p2.display();
		p1.equals(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		if(p1.equals(p2))
			System.out.println("Same");
		else
			System.out.println("Different");
		
			
		}
	}

