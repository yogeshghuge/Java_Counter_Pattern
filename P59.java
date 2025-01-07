/*
1
3       2
6       5       4
10      9       8       7
15      14      13      12      11
*/

class P59
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1; i<=n; i++)
		{
			int t=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print(t+"\t");
				t--;
			}
			System.out.println();
			count+=i+1;
		}
	}
}