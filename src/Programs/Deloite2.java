package Programs;

public class Deloite2 {
	static boolean chkPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int prime(int m,int n)
	{
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			if(chkPrime(i))
			{
				sum+=i;
			}
		}
		return sum;
		
	}
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		print(prime(11, 50));
		
	}
}
