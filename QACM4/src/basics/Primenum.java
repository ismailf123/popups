package basics;

public class Primenum {

	public static void main(String[] args) {
		int num=47;
		int i=2;
		int count=0;
		while(i<=num/2)
		{
			if(num%2==0) {
				count++;
				break;
				}

			i++;
			
		}
	
		if(count==0) {
			System.out.println(num +" is prime");
		}else {
			System.out.println(num + " is not Prime");
		}
			

	}

}
