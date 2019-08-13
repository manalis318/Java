
public class MarketingExecutive extends Employee{
	int kmtravel;
	double toural=5;
	double teleal=2000;
	
	public MarketingExecutive() {
		super();
		kmtravel=0;
		toural=5;
		teleal=2000;
	}
	public MarketingExecutive(int e,String n,double bs,int km) {
		super(e,n,bs);
		kmtravel=km;
		toural=5*km;
		teleal=2000;
	}
	public void display() {
		super.display();
		System.out.println("Kilometres Travelled = "+kmtravel);
		System.out.println("Tour Allowance = "+toural);
		System.out.println("Telephone Allowance = "+teleal);
	}
	public double calcGrossSalary() {
		double gs;
		gs=super.getsalary()+toural+teleal;
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
