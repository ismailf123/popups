package revision;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearchUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		System.out.println("enter the elements of array");
		int[]a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		/*3
		 * System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		System.out.println("enter the element to be searched");
        int key=sc.nextInt();
        int c = 0;
        for (int i = 0; i < size; i++) {
        	if(key==a[i]) {
        		c++;
        		break;
        		
        	
			
		}
			
		}
	if(c==1)
	{
	System.out.println(key+"is found in array");
	}else {
		System.out.println(key+"is not found in array");
	}
	}
}

