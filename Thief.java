//5th ans:Encapsulation-the process of binding data and corresponding methods together into a single unit.

public class Thief{ 
public static void steal()
{
	System.out.println("invoked steal");
	
	double pocket=Reliance.getBudget();
	System.out.println("steal budget "+pocket);
	System.out.println("Reliance budget "+Reliance.getBudget());
	System.out.println("EXIT :: steal");	
}

}