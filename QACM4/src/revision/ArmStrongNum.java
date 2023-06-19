package revision;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num=143;
		int count=0;
		int temp=num;
		int sum=0;
		int otemp=temp;
		while(num>0) {
			num=num/10;
			count++;
		}
		while(temp>0) {
			int rem=temp%10;
			int i=count;
			int res=1;
			while(i>0) {
				res=res*rem;
				i--;
			}
			sum=sum+res;
			temp=temp/10;
		}
		if (sum==otemp) {
			System.out.println("asn");
			
		} else {
			System.out.println("noasn");
			
		}
	}
}
			
			
			
			
			

		
			
			
		
		
		
		
		
		
		
		

	


