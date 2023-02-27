package strings;

public class PrintDupChar {
public static void main(String[] args) {
	String str="JavaJavascript";
	for(int i=0;i<str.length();i++)
	{
		if(str.substring(i+1).contains(str.substring(i,i+1)))
		{
			System.out.println(str.charAt(i));
			str=str.substring(0,i+1)+str.substring(i+1).replaceAll("["+str.substring(i,i+1)+"]","");
			
		}
	}
}
}
