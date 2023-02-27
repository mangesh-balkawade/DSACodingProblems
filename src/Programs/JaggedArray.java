package Programs;

import java.util.Scanner;

public class JaggedArray {
public static void main(String[] args) {
	int arr[][];
	System.out.println("Enter Size of array");
	Scanner sc=new Scanner(System.in);
	int isize=sc.nextInt();
	arr=new int[isize][];
	
	for(int i=0;i<isize;i++)
	{
		System.out.println("eneter no of columns");
		arr[i]=new int[sc.nextInt()];
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	
}
}
