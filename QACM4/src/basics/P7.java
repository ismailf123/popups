package basics;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		while(num>0)
		{
			int rem = num%10;
			System.out.println(rem);
			num=num/10;
		}
	}
}
