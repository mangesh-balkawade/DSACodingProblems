package strings;

public class RemoveCharOneSec {
public static void main(String[] args) {
	String first="india is My n a n ";
	String second="in";
	String ret=first;
	for(int i=0;i<second.length();i++)
	{
		ret=ret.replaceAll(second.substring(i,i+1),"");
	}
	System.out.println(ret);
}
}
