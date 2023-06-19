package String;

public class StringAllMethods {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Apple");
		s1.append(10);
		System.out.println(s1);//Apple10
		System.out.println(s1.charAt(5));//0=A,5=1,6=0
		System.out.println(s1.length());//7(total charters)
		System.out.println(s1.indexOf("1"));//5
		System.out.println(s1.indexOf("A"));//0
		System.out.println(s1.substring(4));//e10 starts from particular given index
		System.out.println(s1.substring(1, 6));//1st index and last index will removed this stmt
		System.out.println(s1.reverse());
		System.out.println(s1.insert(1, 8));//081elppA In index of first Storing 8
		System.out.println(s1. insert(5,"s"));
		s1.trimToSize();
		System.out.println(s1.capacity());// 9 num of elemnts present in string
		System.out.println(s1.delete(1, 8));//0A it gives particular index element 
	     System.out.println(s1.deleteCharAt(1));

}
}