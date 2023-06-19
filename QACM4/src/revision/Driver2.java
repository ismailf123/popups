package revision;

public class Driver2 {

	public static void main(String[] args) {
		car c1=new car();
		c1.price=1000;
         System.out.println(c1.price);
         System.out.println(c1.e1);
         c1.drive();
      
         System.out.println(c1.e1.cc);
         c1.e1.speed();
	}
	

}
