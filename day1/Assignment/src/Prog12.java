import java.util.Scanner;


public class Prog12 {

public static void main(String[] args){
	
int match = 21;
int pick; 
Scanner sc = new Scanner(System.in);
do {
	System.out.println("pick matchsticks ( 1 2 3 or 4)");
	pick=sc.nextInt();
	switch(pick)
	{
	case 1: match-=1;
		if(match==0)
		{
			System.out.println("Matches Left: "+match);
			break;
		}
		System.out.println("computer picks 4");
		match-=4;
		System.out.println("Matches left: "+match);
		break;
		
	case 2: match-=2;
		if(match==0)
		{
			System.out.println("Matches Left: "+match);
			break;
		}
		System.out.println("computer picks 3");
		match-=3;
		System.out.println("Matches left: "+match);
		break;
					
	case 3: match-=3;
		if(match==0)
		{
			System.out.println("Matches Left: "+match);
			break;
		}
		System.out.println("computer picks 2");
		match-=2;
		System.out.println("Matches left: "+match);
		break;
					
	case 4: match-=4;
		if(match==0)
		{
			System.out.println("Matches Left: "+match);
			break;
		}
		System.out.println("computer picks 1");
		match-=1;
		System.out.println("Matches left: "+match);
		break;
	default:
		System.out.println("wrong value");
		}
	}
	while(match!=0);
	System.out.println("Computer Won");
}
}
