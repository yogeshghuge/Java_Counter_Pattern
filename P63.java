/*
15
14      10
13      9       6
12      8       5       3
11      7       4       2       1
*/

class P63
{
	public static void main(String args[])
	{
		int n=5;
		int count= (n*(n+1))/2;
		for(int i=n; i>=1; i--)
		{
			int c=count;
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c-=j-1;
			}
			System.out.println();
			count--;
		}
	}
}
