/*
15
13      14
10      11      12
6       7       8       9
1       2       3       4       5
*/

class P60
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int t=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print(t+"\t");
				t++;
			}
			System.out.println();
			count -=i+1;
		}
	}
}