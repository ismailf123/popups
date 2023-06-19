package basics;

public class Strongnumber {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum = 0;
		while(num>0) {
		 int rem=num%10;
		 int fact=1;
		 while(rem>0) {
			 fact=fact*rem--;
		 }
		 sum=sum+fact;
			num=num/10; 
			 
		 }
			if (temp==sum) {
				System.out.println("strong");
			} else {
				System.out.println("not strong");
			}
	}
}
				 
		

	


