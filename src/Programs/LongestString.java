package Programs;

import java.util.regex.Pattern;

public class LongestString {
public static void main(String[] args) {
	String s="123 shhh 2 ahh ";
	//System.out.println(s.replaceAll("[^A-Z^a-z]", ""));
	System.out.println(s.matches("s..h"));
	 Pattern pattern = Pattern.compile("(s..h|b...a)");
	 System.out.println((pattern.matcher(s)).find());
	 int i=2718;
	 int icnt=0;
	 while(i>10)
	 {
		 int num=0;
		 int temp=i;
		 while(temp>0)
		 {
			 num+=temp%10;
			 temp=temp/10;
		 }
		 i=num;
		 icnt++;
	 }
	 System.out.println(icnt);
}
}
