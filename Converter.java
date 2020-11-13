//3rd ans: coonvert string to primitive
public class Converter{
public static void main(String[] values)
{
System.out.println("JVM invokes main method");
System.out.println("The system will convert string into number");

String englishAlphabets="26";
byte convertedAlphabets=Byte.parseByte(englishAlphabets);
System.out.println("String to Byte:"+convertedAlphabets);

String salary="30000";
short convertedSalary=Short.parseShort(salary);
System.out.println("String to Short:"+convertedSalary);

String forestAreaOfKarnataka="50000";
int convertedArea=Integer.parseInt(forestAreaOfKarnataka);
System.out.println("String to Int:"+convertedArea);

String oneMillionDollarInRupees="65000000";
long convertedRupees=Long.parseLong(oneMillionDollarInRupees);
System.out.println("String to Long:"+convertedRupees);

String studentPercentage="85.3";
float convertedPercentage=Float.parseFloat(studentPercentage);
System.out.println("String to Float:"+convertedPercentage);

String massOfProton="1.000000";
double convertedMass=Double.parseDouble(massOfProton);
System.out.println("String to Double:"+convertedMass);

String flag="True";
boolean convertedFlag=Boolean.parseBoolean(flag);
System.out.println("String to Boolean:"+convertedFlag);

String division="A";
char convertedDivision=division.charAt(0);
System.out.println("String to charAt:"+convertedDivision);

System.out.println("Exit:main()");
}
}

