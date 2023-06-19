package revision;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[]a= {10,30,20,40};
		Arrays.sort(a);
		int key = 40;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
			{
				c++;
				break;
			}
			if(c==1) {
				System.out.println("is ther");
			}else {
				System.out.println("is not");
			}
				
		}

	}

}
