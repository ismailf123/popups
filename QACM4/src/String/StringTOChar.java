package String;

public class StringTOChar {

	public static void main(String[] args) {
		String s1="Hello World";
		char[]ch=new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ch[i]=s1.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			
		}

	}

}
