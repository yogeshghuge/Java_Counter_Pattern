/*
1
2       6
3       7       10
4       8       11      13
5       9       12      14      15
*/

class P61
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=n; i>=1; i--)
		{
			int t=count;
			for(int j=n;j>=i;j--)
			{
				System.out.print(t+"\t");
				t+=j-1;
			}
			System.out.println();
			count++;
		}
	}
}