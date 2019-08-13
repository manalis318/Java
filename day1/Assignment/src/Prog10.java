public class Prog10 {

	public static void main(String [] args) {
		
		int i=3,count,temp;
		System.out.println("First 100 prime numbers are: ");
		System.out.println("2");
		
		for(count=2;count<=100;){
			
			for(temp=2;temp<=i-1;temp++)
			{
				if(i%temp==0){
					break;
				}
			}
			if(temp==i){
				System.out.println(+i+ " ");
				count++;
			}
			i++;
		}
	}

}

