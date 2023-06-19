package revision;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		Arrays.sort(a);
        int key=10;
        int low=0;
        int high=a.length-1;
        int mid= (low+high)/2;
        while(low<=high) {
        	if(a[mid]==key)
        	{
        		System.out.println(key+"is Found");
        		break;
        	}
        		else if(a[mid]>key)
        			high=mid-1;
        		else
        			low=mid+1;
        	mid=(low+high)/2;
        }
        if(low>high) {
        	System.out.println(key+"is  not Found");
        		}
        		}
        }
       
	


