package basics;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int num=sc.nextInt();
		int a=num%100;
		int b=num/100;
		int res=a+b+a*b;
		if(num==res)
		{
			System.out.println("given num is special num");
		}
		else {
			System.out.println(" given num is not special num");
		}
	  }   		
	}

