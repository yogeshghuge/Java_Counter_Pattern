/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1
*/

class P64
{
	public static void main(String args[])
	{
		int n=5;
		int count=((n*(n-1))/2)+1;
		for(int i=n; i>=1; i--)
		{
			int c= count;
  			for(int j=n; j>=i;j--)
			{
				System.out.print(c+ "\t");
				c-=j;
			}
			System.out.println();
			count++;
		}
	}
}