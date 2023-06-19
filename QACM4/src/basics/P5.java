package basics;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int a=sc.nextInt();
		String []s= {"even","odd"};
		System.out.println(s[a%2]);
	}
}
				

	


