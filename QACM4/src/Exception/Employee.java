package Exception;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(){}
	Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		if(sal>0) {
			this.sal=sal;
		}else { 
				throw new NegativeSalaryException();
		}
	}
			public void display()
			{
				System.out.println("employee id"+  id);
				System.out.println("employee name"+ name);
				System.out.println("empl0yee sal"+ sal);
				System.out.println("==============");
				
			}
		}

