package String;

import java.util.Scanner;

public class CityName {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the City Name");
	String city=sc.nextLine();
	System.out.println("enter the area name");
	String area=sc.nextLine();
	char ch=city.charAt(1);
	String s1=ch+"";
	if(area.contains(s1)) {
   System.out.println("Hello");
	}else {
		System.out.println("bye");
	}
	}
}
