package kusuma;

public class LargestSmallestEArray {
public static void main(String[] args)
{
	int[ ] numbers= {10,20,30,40,2,4,21,9};
	int smallest=numbers[0];
	int largest=numbers[0];
	for(int i=1; i<numbers.length; i++)
	{
		if(numbers[i]<smallest) 
		{
		smallest=numbers[i];
		}
		if(numbers[i]>largest)
		{
			largest=numbers[i];	
	}
	}
	System.out.println("smallest+number:"+smallest);
	System.out.println("largest+number:"+largest);
}
}
/*output
smallest+number:2
largest+number:40*/
