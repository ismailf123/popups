
//Using Character Array To String
package String;

public class CharacterToString {

	public static void main(String[] args) {
		char[]ch= {'K','O','u','S','h','i'};
		String s1=new String(ch);//  Constructor method
		String s2=String.valueOf(ch);// ValueOf Method
		String s3=" ";           //Without Builtins
		for (int i = 0; i < ch.length; i++) {
			s3=s3+ch[i];
	        
		}
		
		System.out.println(s1);
		System.out.println(s2);
        System.out.println(s3);
	}

}
