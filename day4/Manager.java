
public class Manager extends Employee {
	private double petrolal;
	private double foodal;
	private double otheral;
	
	public Manager()
	{
		super();
		petrolal=0;
		foodal=0;
		otheral=0;
	}
	public Manager(int e,String n, double bs)
	{
		super(e,n,bs);
		petrolal=0.8*bs;
		foodal=0.12*bs;
		otheral=0.04*bs;
	}
	public void display() {
		super.display();
		System.out.println("Petrol Allowance = "+petrolal);
		System.out.println("Food Allowance = "+foodal);
		System.out.println("Other Allowance = "+otheral);
		
	}
	public double calcGrossSalary() {
		double gs;
		gs=super.getsalary()+petrolal+foodal+otheral;
		return gs;
	}
	public double calcNetSalary() {
		double ns,pf,gs1;
		gs1=calcGrossSalary();
		pf=0.12*super.getsalary();
		ns=gs1-pf;
		return ns;
		
	}
}
