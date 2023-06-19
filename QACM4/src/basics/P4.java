package basics;

import java.util.Scanner;

public class P4 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int a=sc.nextInt();
		switch(a%2)
		{
		case 0:System.out.println("even");
		break;
		case 1:System.out.println("odd");
		}
	}
}
	
	