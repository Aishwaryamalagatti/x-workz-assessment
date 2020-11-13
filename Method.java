//8th ans:Method overloading- Two or more mwthods can have same name but with different parameters.

public class Method{
	
	public static void colouring(int number,String colour){
		System.out.println("invoked colouring with two parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	}	
	
	public static void colouring(String number,String colour){
		System.out.println("invoked colouring with two string parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	
	}
	
}