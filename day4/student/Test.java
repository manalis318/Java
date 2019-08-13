package student;

import java.util.Scanner;

public class Test {
	public static void printObjects(Student s) {
		s.display();
	}
	public static void main(String[] args) {
		int size,choice,cc1,cc2,cc3;
		cc1=cc2=cc3=0;
		char ch='y';
		int i=0;
		Scanner s=new Scanner(System.in);
		Student s1[]=new Student[10];
		InternalStudent is1[]=new InternalStudent[10];
		ExternalStudent ex1[]=new ExternalStudent[10];
		/*System.out.println("Enter the size of the array");
		
		size=s.nextInt();*/
		System.out.println("Enter your choice of details");
		/*System.out.println("Do you want to add more records? (y/n)");
		ch=s.next().charAt(0);*/
		System.out.println("1. Student 2.InternalStudent 3.ExternalStudent");
		choice=s.nextInt();
		switch(choice) {
		case 1 :
			while(ch=='y') {
				s1[i]=new Student();
				s1[i].accept();
				System.out.println("Do you want to add more records? (y/n)");
				ch=s.next().charAt(0);
				i++;
				cc1++;
			}
			break;
		case 2 :
			while(ch=='y') {
				is1[i]=new InternalStudent();
				is1[i].accept();
				System.out.println("Do you want to add more records? (y/n)");
				ch=s.next().charAt(0);
				i++;
				cc2++;
			}
			break;
		
	case 3 :
		while(ch=='y') {
			ex1[i]=new ExternalStudent();
			ex1[i].accept();
			System.out.println("Do you want to add more records? (y/n)");
			ch=s.next().charAt(0);
			i++;
			cc3++;
		}
		break;

	}
		System.out.println("Display all records");
		System.out.println("Students : ");
		for(i=0;i<cc1;i++)
		{
			printObjects(s1[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("Internal Students : ");
		for(i=0;i<cc2;i++)
		{
			printObjects(is1[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("External Students : ");
		for(i=0;i<cc3;i++)
		{
			printObjects(ex1[i]);
			System.out.println();
		}

}}
