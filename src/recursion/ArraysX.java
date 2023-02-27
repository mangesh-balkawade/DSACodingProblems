package recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraysX {
	static boolean sorted(int arr[],int i)
	{
		if(i==arr.length-1)
			return true;
		if(arr[i]<arr[i+1]==false)
			return false;
		else
			return sorted(arr,i+1);
	}
	static boolean linearSearch(int arr[],int index,int target)
	{
		if(index==arr.length)
			return false;
		if(arr[index]==target)
			return true;
		else
		return linearSearch(arr, index+1, target);
	}
	
	static List<Integer> findIndex(int arr[],int target,int index,ArrayList<Integer> list)
	{
		if(index==arr.length)
			return list;
		if(arr[index]==target)
			list.add(index);
		return findIndex(arr, target, index+1, list);
	}
	static List<Integer> findIndex2(int arr[],int target,int index)
	{
		List<Integer>list=new ArrayList<>();
		if(index==arr.length)
			return list;
		if(arr[index]==target)
			list.add(index);
		 list.addAll(findIndex2(arr, target, index+1));
		 return list;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,4,4,5};
		System.out.println(sorted(arr, 0));
		System.out.println(linearSearch(arr, 0, 30));
		System.out.println(findIndex(arr, 4, 0, new ArrayList<>()));
	}
}
