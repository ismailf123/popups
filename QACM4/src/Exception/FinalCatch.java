package Exception;

public class FinalCatch {

	public static void main(String[] args)
	{
		try
	{
		int a=10;
		int b=0;
		 int res=a/b;
		 System.out.println(res);
	}
	//catch(ArithmeticException e) // we see Only output here catch block will catch the Exception
		finally     //We can See Output with Exception
	{
		System.out.println("I am mandatory Fellow");

	}

}
}