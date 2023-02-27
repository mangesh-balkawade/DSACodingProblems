package Programs;

public class AddNumbersString 
{
public static void main(String[] args) {
	String str="12ab@c20yz68";
	str=str.replaceAll("[^0-9]+"," ");
	str=str.replaceAll("[ ]{2,}"," ");
	String arr[]=str.split(" ");
	
	int isum=0;
	for(String s:arr)
	{
		isum=isum+Integer.parseInt(s);
	}
	System.out.println(isum);
}
}
