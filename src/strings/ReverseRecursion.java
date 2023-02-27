package strings;

public class ReverseRecursion {
public static void main(String[] args) {
	String str="Mangesh";
	System.out.println(reverse(str));
}

static String reverse(String str)
{
	if(str.length()==0)
		return "";
	else
		return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
}
}
