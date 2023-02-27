package Programs;

public class Deloitte3 {
public static void main(String[] args) {
	String str="important";
	int n=12;
	if(n<=str.length())
	{
		
		String temp=str.substring(0,n);
		String rev=new StringBuffer(temp).reverse().toString().concat(str.substring(n));
		System.out.println(rev);
		
	}
	else
	{
		String tempString=new StringBuffer(str).reverse().toString();
		String rev=new StringBuffer(tempString.substring(0,n-str.length())).reverse().toString().concat(tempString.substring( n-str.length()));
		System.out.println(rev);
	}
}
}
