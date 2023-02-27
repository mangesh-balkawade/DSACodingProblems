package recursion;

public class RevNo {
	
	static int rev(int no)
	{
		
		return helper(no,(int)(Math.log10(no))+1);
	}
	static int helper(int n,int pow)
	{
		if(n%10==n)
			return n;
		return ((n%10)*(int)(Math.pow(10, pow-1)))+helper(n/10, pow-1);
	}
	
	
	
public static void main(String[] args) {
 
}
}
