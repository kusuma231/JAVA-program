package day2;

public class PairsArray {
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 10 ;
		System.out.println("pairs whose sum is " + target +":");
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=0; j<=arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println(arr[i] + "+" + arr[j] + "=" + target);
				}
			}
		}
	}

}
