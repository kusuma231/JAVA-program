package kusuma;

public class SecondLargestSmallest {
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,2,3,5,90};
		                               //set initial values
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for (int num : arr)           //loop through array
		{
			if (num<smallest)         //find smallest and secondsmallest
			{
				secondsmallest = smallest;
				smallest = num;
			}
			else if(num>smallest && num<secondsmallest)
			{
				secondsmallest = num;
			}
			if (num>largest)           //find largest and secondlargest
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

