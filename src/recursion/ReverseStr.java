package recursion;

public class ReverseStr {
static String reverse(String str)
{
	if(str.length()==0)
		return "";
	return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
}
public static void main(String[] args) {
	System.out.println(reverse("Mangesh"));
}
}
