
public class Test {
	public static void printObjects(Employee e) {
		e.display();
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		MarketingExecutive me1=new MarketingExecutive();
		Manager m1=new Manager();
		printObjects(e1);
		System.out.println();
		printObjects(me1);
		System.out.println();
		printObjects(m1);
		System.out.println();
		Employee e2=new Employee(1,"Tushar",8000);
		MarketingExecutive me2=new MarketingExecutive(2,"Nitul",10000,10);
		Manager m2=new Manager(3,"Hrithik",6000);
		printObjects(e2);
		System.out.println();
		printObjects(me2);
		System.out.println();
		printObjects(m2);
		System.out.println();


	}

}
