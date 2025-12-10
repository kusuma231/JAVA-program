package kusuma;

public class SimpleCalculator {
public void add(int value1,int value2)
{
	int result=value1+value2;
	System.out.println("Addition="+result);
}
 void sub(int value1,int value2)
{
	int result=value1-value2;
	System.out.println("subtraction="+result);
}
 void mult(int value1,int value2)
 {
 	int result=value1-value2;
 	System.out.println("multiplication="+result);
 } 
 void div(int value1,int value2)
 {
 	int result=value1-value2;
 	System.out.println("Divison="+result);
 } 
public static void main(String[] args)
{
	SimpleCalculator simplecalculator=new SimpleCalculator();
	
	simplecalculator.add(10,20);
	simplecalculator.sub(5,3);
	simplecalculator.mult(8,5);
	simplecalculator.div(4,2);
}
}