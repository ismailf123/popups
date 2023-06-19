package Exception;

import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		try {
			System.out.println("=====welcome to my world");
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the value of numerator");
			int numerator=sc.nextInt();
			System.out.println("enter the value of numerator");
			int denomonitor=sc.nextInt();
			int res=numerator/denomonitor;
			System.out.println(numerator+"/"+denomonitor+"="+res);
			
	}
		
		 catch (ArithmeticException e) {
			System.out.println("please do not enter zero in Denominator");
		}
		catch(Exception e1) 
			{
				System.out.println("Please pass only integer in numeratoe and denominator");
			}
	}
}



			
			
			
		

	


