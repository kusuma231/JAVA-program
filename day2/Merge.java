package day2;

public class Merge {
	public static void main (String[] args)
	{
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {8, 7, 6, 9};
		int[] merged = new int[arr1.length + arr2.length];
		for(int i=0; i<arr1.length; i++)
		{
			merged[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++)
		{
			merged[arr1.length + i]	= arr2[i];
		}
		System.out.println("Merged  Array:");
		for(int i=0; i<merged.length; i++)
		{
			System.out.println(merged[i] + " ");
		}
	}
}
/*output
Merged  Array:
1 
2 
3 
4 
8 
*/
