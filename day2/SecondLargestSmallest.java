package kusuma;

public class SecondLargestSmallest {
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,2,3,5,90};
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int num : arr)
		{
			if (num<smallest)
			{
				secondsmallest = smallest;
				smallest = num;
			}
			else if(num>smallest && num<secondsmallest)
			{
				secondsmallest = num;
			}
			if (num>largest)
			{
				secondlargest = largest;
				largest = num;
			}
			else if(num<largest && num>secondlargest)
			{
				secondlargest = num;
			}
	}
		System.out.println("smallest:"+smallest);
		System.out.println("secondsmallest:"+secondsmallest);
		System.out.println("largest:"+largest);
		System.out.println("secondlargest:"+secondlargest);
}
}
