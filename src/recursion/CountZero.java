package recursion;

public class CountZero {
	static int cnt0(int n,int c)
	{
		if(n==0)
			return c;
		if((n%10)==0)
			return cnt0(n/10, ++c);
		else
			return cnt0(n/10, c);
		
	}
	public static void main(String[] args) {
		System.out.println(cnt0(1002, 0));
	}
}
