package day2;

public class ReverseArray {
	public static void main(String[] args)
	{
		int[ ] numbers= {1,2,3,4};
		System.out.println("ReverseArray");
		for(int i=numbers.length-1; i>=0; i--)
		{
			System.out.println(numbers[i]);
		}
	}
}
