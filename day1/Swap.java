package kusuma;

public class Swap
{
	public static void main(String[] args)
	{
		int value1=10;
		int value2=20;
				System.out.println("Value1:"+value1);
				System.out.println("Value2:"+value2);
				int temp=value1;
				value1=value2;
				value2=temp;
				System.out.println("Swaping number:"+value1+"="+value2);
		
	}
}
/*output
Value1:10
Value2:20
Swaping number:20=10*/

