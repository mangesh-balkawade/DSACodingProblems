package strings;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
	
	//Normal fakt string cut karat jato
	static void subSeq(String temp, String str) {
		if (str.length() == 0) {
			System.out.println(temp);
			return;
		}
		subSeq(temp + str.charAt(0), str.substring(1));
		subSeq(temp, str.substring(1));
	}
	
	// ARraylist return
	static ArrayList<String> subSeq2(String temp, String str,ArrayList< String> list) {
		if (str.length() == 0) {
			list.add(temp);
			return list ;
		}
		subSeq(temp + str.charAt(0), str.substring(1));
		subSeq(temp, str.substring(1));
		return list;
	}
	
	
	static List<List<Integer>> SubArray(int arr[])
	{
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		ArrayList<Integer> list=new ArrayList<>();
		outer.add(list);
		
		// Each element of array should be added in the each element present inside the 
		// previous list;
		
		for(int num:arr)
		{
			// Taken Size here because we are adding elments in the loop 
			int size=outer.size();
			
			// Adding each element of array in previous lists.
			
			for(int i=0;i<size;i++)
			{
			  ArrayList<Integer> internal=new ArrayList<>();
			  internal.addAll(outer.get(i));
			  internal.add(num);
			  outer.add(internal);
			}
		}

		
		return outer;
		
	}
	
	
	static void permutations(String temp,String str)
	{
		if(str.length()==0)
		{
			System.out.println(temp);
			return ;
		}
		// Taken the character ;
		char ch=str.charAt(0);
		
		// Each time the no of recursions we have to made are = size of temp + 1;
		// The character can be add at 3 pos eg
		// AB & /C rem.
		// _AB A_B AB_ = CAB ACB ABC
		for(int i=0;i<=temp.length();i++)
		{
			String first=temp.substring(0,i);
			String second=temp.substring(i);
			permutations(first+ch+second, str.substring(1));
		}
	}
	
	static ArrayList<String> permutations2(String temp,String str,ArrayList<String>list)
	{
		if(str.length()==0)
		{
		   list.add(temp);	
			return list;
		}
		char ch=str.charAt(0);
		for(int i=0;i<=temp.length();i++)
		{
			String first=temp.substring(0,i);
			String second=temp.substring(i);
			permutations(first+ch+second, str.substring(1));
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		System.out.println("---------Printing the subsequences of strings-----------");
        subSeq("","ABC");
        
        System.out.println("---------Arraylist the subsequences of strings-----------");
		ArrayList<String> list1= subSeq2("","ABC", new ArrayList<String>());
		for (String string : list1) {
			System.out.println(string);
		}
		
		System.out.println("---------Printing the Sub Arrays -----------");
		int arr[]= {1,2,3};
		System.out.println(SubArray(arr));
		
		System.out.println("---------Printing the Permutations of strings-----------");
		permutations("","ABC");
		
		System.out.println("---------Printing the Permutations of strings-----------");
		ArrayList<String> list2=permutations2("","ABC", new ArrayList<>());
		for (String string : list2) {
			System.out.println(string);
		}
	
		
		
	}
}
