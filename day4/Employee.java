
public class Employee {
	private int empid;
	private String ename;
	private double bsalary;
	
	public Employee() {
		empid=0;
		ename=null;
		bsalary=0;
	}
	public Employee(int e,String n,double bs) {
		empid=e;
		ename=n;
		bsalary=bs;
	}
	public void display() {
		System.out.println("Employee id = "+empid);
		System.out.println("Employee name = "+ename);
		System.out.println("Salary = "+bsalary);
	}
	public int getempid() {
		return empid;
	}
	public String getempname() {
		return ename;
	}
	public double getsalary() {
		return bsalary;
	}
}

