package Programs;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayGroup {
	 public static int maximumGroups(int n, int[] x) {
	        int groupCount = 0;
	        HashMap<Integer, Integer> factorIndices = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            int factor = x[i];
	            if (factorIndices.containsKey(factor)) {
	            	System.out.println(factor);
	                groupCount++;
	                factorIndices.remove(factor);
	            } else {
	                factorIndices.put(factor, i);
	            }
	        }

	        return groupCount;
	    }
public static void main(String[] args) {
	
      int[] x = { 1,2,10,22,31,2,5,3,8,6};
      System.out.println(Arrays.toString(mergeSort(x))); // Output: 2
    
}
static int [] mergeSort(int arr[])
{
	if(arr.length==1)
		return arr;
	
	int left[]=Arrays.copyOfRange(arr, 0, arr.length/2);
	int right[]=Arrays.copyOfRange(arr, arr.length/2, arr.length);
	left=mergeSort(left);
	right=mergeSort(right);
	return merge(left,right);
}
static int [] merge(int[] l,int[] r)
{
	int mix[]=new int[l.length+r.length];
	int i=0,j=0,k=0;
	while(i<l.length&&j<r.length)
	{
		if(l[i]<r[j])
		{
			mix[k]=l[i];i++;
		}
		else
		{
			mix[k]=r[j];j++;
		}
		k++;
		
	}
	while(i<l.length)
	{
		mix[k]=l[i];
		k++;
		i++;
	}
	while(j<r.length)
	{
		mix[k]=r[j];j++;k++;
	}
	return mix;
}
}

