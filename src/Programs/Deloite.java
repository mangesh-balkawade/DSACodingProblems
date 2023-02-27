package Programs;

import java.util.Arrays;

public class Deloite {
public static void main(String[] args) {
	String s="39564";
	StringBuffer sbr=new StringBuffer();
	
	for(int i=0;i<s.length();i++)
	{
		int num=Integer.parseInt(s.substring(i, i+1));
		char c=(char) (num+64);
		sbr.append(c);
	}
	char arr[]=sbr.toString().toCharArray();
	Arrays.sort(arr);
	String ret=new String(arr);     
	System.out.println(ret);
	
	//int arr[][]=new int[3][3];	
	
}
}
