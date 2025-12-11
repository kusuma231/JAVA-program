package day2;

public class CountFrequencyArray {
	public static void main(String[] args) 
	{
		int[ ] arr= {1, 2, 3, 4, 5, 6, 1, 2, 4, 2};
		boolean[] visited = new boolean[arr.length];
		for(int i=0; i< arr.length; i++)
		{
			if (visited[i])
			{
				continue;
			}
			int count=1;
			for (int j =i; j < arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
	}
}
/*output 
3->2
4->3
5->2
6->2*/

