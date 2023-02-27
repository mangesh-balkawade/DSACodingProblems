package Programs;

import java.util.Scanner;

public class StringOccur 
{
 public static void main(String[] args) {
	 String s="";
	for(int i=1;i<10;i++)
	{
		Scanner sc=new Scanner(System.in);
		Character c=sc.nextLine().charAt(0);
		if(s.contains(c.toString()))
		{
			s=s.concat("#");
		}
		else
		{
			s=s.concat(c.toString());
		}
		System.out.println(s);
	}
	
}
}
