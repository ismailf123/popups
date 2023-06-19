package String;

public class SwapWithoutUsingExtraVariable {

	public static void main(String[] args) {
		String S1="Ismail";
		String S2="Aishu";
		S1=S1+" "+S2;
		S2=S2+" "+S1;
		S1=S1.split(" ")[1];
        S2=S2.split(" ")[1];
		System.out.println(S1);
		System.out.println(S2);
	}

}
