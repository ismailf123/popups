import java.util.Arrays;
	
class A
{
	public static void main(String[]args)
	{
		int[]a= {20,40,10,30,60,50};
		System.out.println("elements of array before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//to sort the elements using built-ins
		Arrays.sort(a);
		System.out.println("elements of array before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("second largest element is:"+a[a.length-2]);
	}
}
