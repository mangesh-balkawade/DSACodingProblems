package strings;

public class RemoveDupChar {
public static void main(String[] args) {
	String str="JavaMmanJSd";
//	Set<Character> set1=new LinkedHashSet<>();
//	for(int i=0;i<str.length();i++)
//	{
//		set1.add(str.charAt(i));
//	}
//	System.out.println(set1.toString());
	for(int i=0;i<str.length();i++)
	{
		str=str.substring(0,i+1)+(str.substring(i+1).replaceAll("["+str.substring(i,i+1)+"]",""));
		System.out.println(str);	
	}
	System.out.println(str);
}
}
