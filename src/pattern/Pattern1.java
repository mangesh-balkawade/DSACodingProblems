package pattern;

public class Pattern1 {
public static void main(String[] args) {
	int n=5;
	pattern4(n);
}
static void pattern4(int n)
{
	int r=n+1;
	int mid=n+1;
	for(int i=1;i<=n;i++,r+=2)
	{
		for(int j=1,l=i;j<n*2;j++)
		{
			
			if((i+j)>=(n+1)&&(i+j)<=r)
			{
				if((i+j)<mid)
				{
				System.out.print(l);
				l--;
				}
				else
				{
					System.out.print(l);
					l++;
				}
				
			}
			else
			{
				System.out.print(" ");
			}
		
		}
		++mid;
		System.out.println();
	}
}
public static void pattern3(int n)
{
	int l1=n+1;
	int r1=n+1;
	
	for(int i=1;i<n*2;i++)
	{
		
		for(int j=1;j<n*2;j++)
		{
			if(i<=n)
			{
				if((i+j)>=l1&&(i+j)<=r1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			else
			{
				
				if((i+j)>=l1&&(i+j)<=r1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
		
		r1=(i<n)?(r1+=2):(r1);
		l1=(i<n)?(l1):(l1+=2);
		
		System.out.println();
	}
}
public static void pattern1(int n)
{
	int count=0;
	for(int i=1;i<n*2;i++)
	{
		if(i<=n)
			count++;
		else
			count--;
		for(int j=1;j<=count;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void pattern2(int n)
{
	int count=0;
	for(int i=1;i<=n;i++)
	{
		
		for(int j=1;j<=n;j++)
		{
			if(i+j>=n+1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
