package revision;

public class Driver3 {

	public static void main(String[] args) {
		College c1=new College();
		c1.name="PESIT";
      System.out.println(c1.name);
      System.out.println(c1.s1);
      c1.admission("Sheela");
      System.out.println(c1.s1.sid);
      c1.s1.bunk();
      System.out.println(c1.s1);
      
	}

}
