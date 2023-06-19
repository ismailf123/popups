package basics;

public class Fibonacinumber {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while(sum<=20)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
				

	}

}
