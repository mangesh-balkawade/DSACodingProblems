package datastructure;

import java.util.stream.Stream;

import streams.Streams1;

// Temporary Array - i st aproach
// Same Array 2 approach
// Set 3 rd aproacch

public class ArrayDupRemoval 
{
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,4,5,5,6,6,6,7};
	
	int j=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			arr[j]=arr[i];
			j++;
		}
	}
	arr[j]=arr[arr.length-1];
	for(int i:arr)
	{
		System.out.println(i);
	}
	
}
}
