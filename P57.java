/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15

*/

class P57
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count +"\t");
				count++;
			}
			System.out.println();
		}
	}
}